package com.binarybayou.ras.impl;

import com.binarybayou.domains.User;
import com.binarybayou.ras.IResourceAccessor;
import com.binarybayou.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
@Service
public class UserResourceAccessor implements IResourceAccessor<User>{

    @Autowired
    IUserRepository repo;

    @Override
    public User find(Long id) {
        return repo.findOne(id);
    }

    @Override
    public Iterable<User> findAll() {
        return repo.findAll();
    }

    @Override
    public Long add(User entity) {
        System.out.println("ENTITY WOOP: " + entity.toString());
        return repo.save(entity).getId();
    }

    @Override
    public Long update(User entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
