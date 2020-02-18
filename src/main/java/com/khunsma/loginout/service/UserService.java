package com.khunsma.loginout.service;


import com.khunsma.loginout.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
