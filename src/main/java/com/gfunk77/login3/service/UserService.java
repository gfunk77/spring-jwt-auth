package com.gfunk77.login3.service;

import com.gfunk77.login3.entity.User;

public interface UserService {
    User createUser(User user);
    User getUser(Long id);
}
