package com.divya.iam.service;

public class CustomUserDetailsService {

    public void loadUserByUsername(String username) {
        System.out.println("Loading user: " + username);
    }
}
