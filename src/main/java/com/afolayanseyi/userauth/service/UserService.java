package com.afolayanseyi.userauth.service;

import com.afolayanseyi.userauth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
