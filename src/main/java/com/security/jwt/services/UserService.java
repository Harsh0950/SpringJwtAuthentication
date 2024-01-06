package com.security.jwt.services;

import com.security.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService () {
        store.add(new User(UUID.randomUUID().toString(),"harsh","harsh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"karan","karan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"prince","prince@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"bhavya","bhavya@gmail.com"));
    }
    public List<User> getAllUsers(){
        return this.store;
    }
}
