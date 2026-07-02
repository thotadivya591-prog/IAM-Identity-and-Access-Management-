package com.divya.iam.service;

public class AuditLogService {

    public void logAction(String username, String action) {
        System.out.println(username + " performed: " + action);
    }
}
