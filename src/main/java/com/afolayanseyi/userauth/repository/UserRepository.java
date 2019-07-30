package com.afolayanseyi.userauth.repository;

import com.afolayanseyi.userauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
