package com.gfunk77.login3.repository;

import com.gfunk77.login3.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
