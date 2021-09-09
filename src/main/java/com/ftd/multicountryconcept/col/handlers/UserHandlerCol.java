package com.ftd.multicountryconcept.col.handlers;

import com.ftd.multicountryconcept.col.repositories.UserRepositoryCol;
import com.ftd.multicountryconcept.entities.User;
import com.ftd.multicountryconcept.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class UserHandlerCol implements UserService {

    @Autowired
    private UserRepositoryCol userRepositoryCol;


    @Override
    public User createUser() {
        User user = new User();
        user.setAge(12);
        user.setEmail("Email" + Calendar.getInstance().getTime().getTime() + "Col");
        user.setName("Colombian User");
        return userRepositoryCol.save(user);
    }


}
