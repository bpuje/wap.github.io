package com.cs544.authservice.authservice.serviceImpl;

import com.cs544.authservice.authservice.model.Role;
import com.cs544.authservice.authservice.repository.RoleRepository;
import com.cs544.authservice.authservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        Optional<Role> roleDb = roleRepository.findByRoleName(role.getRoleName());
        if (roleDb.isEmpty()) {
            return roleRepository.save(role);
        }
        ;
        return new Role();
    }
}
