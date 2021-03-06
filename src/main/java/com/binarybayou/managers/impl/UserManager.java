package com.binarybayou.managers.impl;

import com.binarybayou.converters.UserConverter;
import com.binarybayou.domains.User;
import com.binarybayou.exceptions.ValidationException;
import com.binarybayou.managers.IManager;
import com.binarybayou.ras.impl.UserResourceAccessor;
import com.binarybayou.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.ws.rs.NotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
@Service
public class UserManager implements IManager<UserView> {

    @Autowired
    private UserResourceAccessor userRas;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserView get(Long id){
        UserView userView;
        User user = userRas.find(id);

        if (user == null) {
            throw new NotFoundException(String.valueOf(id));
        } else {
            userView = userConverter.convertToView(user);
        }

        return userView;
    }

    @Override
    public List<UserView> getAll(){

        List<UserView> viewList = new ArrayList<>();

        for (User u : userRas.findAll() ) {
            viewList.add(userConverter.convertToView(u));
        }

        return viewList;
    }

    @Override
    public Long add(UserView view) {
        Long id = -1L;
        try {
            id = userRas.add(userConverter.convertToDomain(view));
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public UserView update(UserView view){
        User user = null;

        try {
            user = userRas.update(userConverter.convertToDomain(view));
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        return userConverter.convertToView(user);
    }

    @Override
    public void delete(Long id) {
        userRas.delete(id);
    }
}
