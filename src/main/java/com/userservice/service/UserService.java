package com.userservice.service;

import com.userservice.entity.Login;
import com.userservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String userName);
    User saveUser(User user);

    String doLogin(Login login);

    String doLogout(Login login);
}
