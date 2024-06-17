package com.project.crudhandler.service;

import com.project.crudhandler.model.User;
import java.util.List;

public interface UserServiceI {

    User createUser(User user);

    User updateUser(User user, Long userId);

    User getSingleUser(Long userId);

    List<User> getAllUser();

    List<User> getAllUsers();

    void deleteUser(Long userId);
}
