package com.gfunk77.login3.service;

import com.gfunk77.login3.entity.User;

public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User createUser(User user);
}
