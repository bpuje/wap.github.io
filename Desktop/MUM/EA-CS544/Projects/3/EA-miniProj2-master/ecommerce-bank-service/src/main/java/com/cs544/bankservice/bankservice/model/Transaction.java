package com.cs544.bankservice.bankservice.model;

public class Transaction {

    private String firstName;
    private String lastName;
    private String routingNumber;
    private String bankNumber;

    public Transaction() {
    }

    public Transaction(String firstName, String lastName, String routingNumber, String bankNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.routingNumber = routingNumber;
        this.bankNumber = bankNumber;
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

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }
}
