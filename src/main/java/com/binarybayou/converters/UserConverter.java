package com.binarybayou.converters;

import com.binarybayou.domains.User;
import com.binarybayou.exceptions.ValidationException;
import com.binarybayou.views.UserView;
import org.springframework.stereotype.Component;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
@Component("UserConverter")
public class UserConverter {

    public UserView convertToView(User domain) {
        UserView view = new UserView(); //this will be the newly created View version of the domain Object

        return view;    //return the View version of the given domain Object
    }

    public User convertToDomain(UserView view) throws ValidationException {
        User domain = new User();   //this will be the newly created Domain version of the view Object

        return domain;
    }
}
