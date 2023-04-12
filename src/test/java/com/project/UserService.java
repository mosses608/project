package com.project.demo;

import java.util.List;

public interface UserInterface{

    User create(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);
    
    void deleteUser(Long userId);
}