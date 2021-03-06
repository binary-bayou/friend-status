package com.binarybayou.controllers;

import com.binarybayou.managers.impl.UserManager;
import com.binarybayou.views.UserView;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Joshua Eaton on 8/15/17.
 */
@RestController
@RequestMapping("service/v1/users")
public class UserControllerV1 {

    @Autowired
    private UserManager manager;

    @ApiOperation(value = "Get a list of all Users in the system", response = ResponseEntity.class)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<UserView>> getAll() {

        ResponseEntity<List<UserView>> responseEntity;
        responseEntity = new ResponseEntity<>(manager.getAll(), HttpStatus.OK);

        //TODO: implement excpetion handling
        //responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return responseEntity;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getUserById(@PathVariable("id") Long id) {

        return new ResponseEntity(manager.get(id),HttpStatus.OK);
    }


    @ApiOperation(value = "Add a user", response = ResponseEntity.class)
    @RequestMapping(value = "/add", method = RequestMethod.POST)   //sets the mapping url and the HTTP method
    public ResponseEntity<Long> add(@RequestBody UserView view) {

        ResponseEntity<Long> responseEntity;

        responseEntity = new ResponseEntity<>(manager.add(view), HttpStatus.OK);

        return responseEntity;
    }

    @ApiOperation(value = "Update a user", response = ResponseEntity.class)
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<UserView> update(@RequestBody UserView view) {

        ResponseEntity<UserView> responseEntity;

        responseEntity = new ResponseEntity<>(manager.update(view), HttpStatus.OK);

        return responseEntity;
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable("id") Long id) {
        manager.delete(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
