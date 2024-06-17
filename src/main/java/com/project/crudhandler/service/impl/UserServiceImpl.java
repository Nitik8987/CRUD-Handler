package com.project.crudhandler.service.impl;

import com.project.crudhandler.model.User;
import com.project.crudhandler.repository.UserRepository;
import com.project.crudhandler.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserRepository userRepository;



    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }

    @Override
    public User getSingleUser(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
