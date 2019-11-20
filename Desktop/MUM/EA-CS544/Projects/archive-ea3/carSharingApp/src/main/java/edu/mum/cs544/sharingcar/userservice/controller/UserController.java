package edu.mum.cs544.sharingcar.userservice.controller;

import edu.mum.cs544.sharingcar.userservice.entity.User;
import edu.mum.cs544.sharingcar.userservice.repository.UserRepository;
import edu.mum.cs544.sharingcar.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private UserService userService;

    @PostMapping("/save")
    public User addUser(@RequestBody User newUser){
        User user = new User(newUser.getId(), newUser.getFirstName(),
                newUser.getLastName(), newUser.getUserName(),
                newUser.getPhone(), newUser.getEmail(), newUser.getAge());
        userRepository.save(user);
        return user;
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        Iterable<User> result = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        result.forEach(userList::add);
        return userList;
    }

    @PutMapping("/update/{id}")
    public Optional<User> updateUser(@RequestBody User newUser, @PathVariable int id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setId(newUser.getId());
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());
            user.setUserName(newUser.getUserName());
            user.setEmail(newUser.getEmail());
            user.setPhone(newUser.getPhone());
            user.setAge(newUser.getAge());
        }
        return optionalUser;
    }

    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional;
    }

    @DeleteMapping(value = "/delete/{id}"/*, produces = "application/json; charset=utf-8"*/)
    public String deleteUser(@PathVariable int id){
        boolean result = userRepository.existsById(id);
        userRepository.deleteById(id);
        return "{ \"success\" : "+ (result ? "true" : "false") +" }";
    }

}
