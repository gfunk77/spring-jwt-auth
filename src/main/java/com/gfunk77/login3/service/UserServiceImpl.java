package com.gfunk77.login3.service;

import com.gfunk77.login3.entity.User;
import com.gfunk77.login3.exception.EntityNotFoundException;
import com.gfunk77.login3.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(id, user);
    }

    static User unwrapUser(Long id, Optional<User> user) {
        if (user.isPresent()) return user.get();
        else throw new EntityNotFoundException(id, User.class);
    }
}


