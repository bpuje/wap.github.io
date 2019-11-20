package mum.edu.cs544.ecommerce.eCommercedbservice.resource;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.User;
import mum.edu.cs544.ecommerce.eCommercedbservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db/user")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("{userName}")
    public List<String> getUserByUserName(@PathVariable("userName") String userName) {
        List<User> userList = userRepository.findByUserName(userName);
        List<String> custName = new ArrayList<String>();
        for (User user : userList) {
            custName.add(user.getFullName());
        }
        return custName;
    }

    @GetMapping("/getAllUser") // maybe not use
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


}
