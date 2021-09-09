package com.ftd.multicountryconcept.controllers;


import com.ftd.multicountryconcept.entities.User;
import com.ftd.multicountryconcept.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userHandlerCol")
    UserService userServiceCol;

    @Autowired
    @Qualifier("userHandlerVen")
    UserService userServiceVen;


    @PostMapping
    public ResponseEntity<User> createUser(@RequestHeader(name = "country") String country) {
        return new ResponseEntity<>(
                country.equals("VEN") ? userServiceVen.createUser() : userServiceCol.createUser(),
                HttpStatus.CREATED);
    }

}
