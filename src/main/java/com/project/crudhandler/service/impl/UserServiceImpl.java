package com.project.crudhandler.service.impl;

import com.project.crudhandler.model.User;
import com.project.crudhandler.repository.UserRepository;
import com.project.crudhandler.service.UserServiceI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        log.info("Saving new user: {}", user);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long userId) {
        log.info("Updating user with ID: {}", userId);
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server with ID: " + userId));

        existingUser.setUserName(user.getUserName());
        existingUser.setUserAge(user.getUserAge());
        existingUser.setAbout(user.getAbout());
        return userRepository.save(existingUser);
    }

    @Override
    public User getSingleUser(Long userId) {
        log.info("Fetching user with ID: {}", userId);
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server with ID: " + userId));
    }

    @Override
    public List<User> getAllUser() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        log.info("Deleting user with ID: {}", userId);
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server with ID: " + userId));
        userRepository.delete(user);
    }
}
