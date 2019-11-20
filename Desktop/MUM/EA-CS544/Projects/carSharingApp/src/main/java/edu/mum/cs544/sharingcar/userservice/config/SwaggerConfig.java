package edu.mum.cs544.sharingcar.userservice.config;

import edu.mum.cs544.sharingcar.userservice.entity.Driver;
import edu.mum.cs544.sharingcar.userservice.repository.DriverRepository;
import edu.mum.cs544.sharingcar.userservice.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;

public class SwaggerConfig implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Iterable<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver getDriverById(Integer driverId) {
        return driverRepository.findById(driverId).orElse(null);
    }

    @Override
    public void deleteDriverById(Integer driverId) {
        driverRepository.deleteById(driverId);
    }
}
