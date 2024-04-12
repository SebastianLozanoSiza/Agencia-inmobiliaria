package com.example.demo.repositories.models;

import lombok.Data;

@Data
public class JWTRequest {

    private String username;
    private String password;
    
}