package edu.mum.cs544.sharingcar.userservice.controller;

import edu.mum.cs544.sharingcar.userservice.entity.Driver;
import edu.mum.cs544.sharingcar.userservice.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;

    @PostMapping("/save")
    public Driver addDriver(@RequestBody Driver newDriver){
        Driver driver = new Driver(newDriver.getId(), newDriver.getFirstName(),
                newDriver.getLastName(), newDriver.getUserName(),
                newDriver.getPhone(), newDriver.getEmail(), newDriver.getAge());
        driverRepository.save(driver);
        return driver;
    }

    @GetMapping("/getAllDrivers")
    public List<Driver> getDrivers(){
        Iterable<Driver> result = driverRepository.findAll();
        List<Driver> driverList = new ArrayList<>();
        result.forEach(driverList::add);
        return driverList;
    }

    @PutMapping("/update/{id}")
    public Optional<Driver> updateUser(@RequestBody Driver newUser, @PathVariable int id){
        Optional<Driver> optionalUser = driverRepository.findById(id);
        if(optionalUser.isPresent()){
            Driver driver = optionalUser.get();
            driver.setId(newUser.getId());
            driver.setFirstName(newUser.getFirstName());
            driver.setLastName(newUser.getLastName());
            driver.setUserName(newUser.getUserName());
            driver.setEmail(newUser.getEmail());
            driver.setPhone(newUser.getPhone());
            driver.setAge(newUser.getAge());
        }
        return optionalUser;
    }

    @GetMapping("/getDriverById/{id}")
    public Optional<Driver> getUserById(@PathVariable int id){
        Optional<Driver> driverOptional = driverRepository.findById(id);
        return driverOptional;
    }

    @DeleteMapping(value = "/delete/{id}"/*, produces = "application/json; charset=utf-8"*/)
    public String deleteUser(@PathVariable int id){
        boolean result = driverRepository.existsById(id);
        driverRepository.deleteById(id);
        return "{ \"success\" : "+ (result ? "true" : "false") +" }";
    }

}
