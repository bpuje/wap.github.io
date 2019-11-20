package com.cs544.authservice.authservice.model;

public class JwtResponse {
    private final String jwttoken;

    public JwtResponse(String token) {
        this.jwttoken = token;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
