package com.cs544.authservice.authservice;

import com.cs544.authservice.authservice.model.Role;
import com.cs544.authservice.authservice.model.User;
import com.cs544.authservice.authservice.serviceImpl.RoleServiceImpl;
import com.cs544.authservice.authservice.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthServiceApplication implements CommandLineRunner {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private RoleServiceImpl roleService;

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role("ROLE_ADMIN");
        Role role1 = new Role("ROLE_USER");

        Role adminRole = saveRole(role);
        System.out.println(adminRole);
        Role userRole = saveRole(role1);
        System.out.println(userRole);

        if (adminRole.getRoleName() != null) {
            User admin = new User("admin", "admin", adminRole);
            User adimUser = saveUser(admin);
            System.out.println(adimUser);
        }
        if (userRole.getRoleName() != null) {
            User user = new User("user", "user", userRole);
            User userUser = saveUser(user);
            System.out.println(userUser);
        }
    }

    private User saveUser(User user) {
        return userService.saveUser(user);
    }

    private Role saveRole(Role role) {
        return roleService.saveRole(role);
    }
}
