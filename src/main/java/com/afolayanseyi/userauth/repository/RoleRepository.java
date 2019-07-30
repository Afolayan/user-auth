package com.afolayanseyi.userauth.repository;

import com.afolayanseyi.userauth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
