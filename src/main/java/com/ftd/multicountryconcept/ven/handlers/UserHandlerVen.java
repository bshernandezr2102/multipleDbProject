package com.ftd.multicountryconcept.ven.handlers;


import com.ftd.multicountryconcept.entities.User;
import com.ftd.multicountryconcept.services.UserService;
import com.ftd.multicountryconcept.ven.repositories.UserRepositoryVen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class UserHandlerVen implements UserService {

    @Autowired
    private UserRepositoryVen userRepositoryVen;

    @Override
    public User createUser() {
        User user = new User();
        user.setAge(12);
        user.setEmail("Email" + Calendar.getInstance().getTime().getTime() + "Ven");
        user.setName("Venezuela User");
        return userRepositoryVen.save(user);
    }

}
