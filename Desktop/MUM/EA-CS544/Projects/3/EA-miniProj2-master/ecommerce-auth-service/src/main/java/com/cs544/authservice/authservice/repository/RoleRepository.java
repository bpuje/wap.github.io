package com.cs544.authservice.authservice.repository;

import com.cs544.authservice.authservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Optional<Role> findByRoleName(String roleName);
}
