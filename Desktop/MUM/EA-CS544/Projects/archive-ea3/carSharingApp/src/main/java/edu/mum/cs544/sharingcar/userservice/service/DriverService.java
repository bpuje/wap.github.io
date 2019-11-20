package edu.mum.cs544.sharingcar.userservice.service;

import edu.mum.cs544.sharingcar.userservice.entity.Driver;

public interface DriverService {
    Iterable<Driver> getAllDrivers();
    Driver saveDriver(Driver driver);
    Driver getDriverById(Integer driverId);
    void deleteDriverById(Integer driverId);
}
