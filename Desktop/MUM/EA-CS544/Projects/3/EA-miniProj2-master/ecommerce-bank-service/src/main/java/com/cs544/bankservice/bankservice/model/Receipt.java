package com.cs544.bankservice.bankservice.model;

import java.time.LocalDate;

public class Receipt {

    private String firstName;
    private String lastName;
    private LocalDate timeStamp;
    private String description;

    public Receipt() {
    }

    public Receipt(String firstName, String lastName, LocalDate timeStamp, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.timeStamp = timeStamp;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
