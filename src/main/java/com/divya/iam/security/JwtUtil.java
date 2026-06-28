package com.divya.iam.security;

public class JwtUtil {

    public String generateToken(String username) {
        return "jwt-token-for-" + username;
    }
}
