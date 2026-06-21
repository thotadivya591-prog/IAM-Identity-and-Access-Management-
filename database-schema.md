# Database Schema

## Users Table

| Column Name | Data Type |
|------------|-----------|
| id | BIGINT |
| username | VARCHAR(50) |
| email | VARCHAR(100) |
| password | VARCHAR(255) |
| role | VARCHAR(20) |

## Audit Logs Table

| Column Name | Data Type |
|------------|-----------|
| id | BIGINT |
| user_id | BIGINT |
| action | VARCHAR(100) |
| timestamp | TIMESTAMP |
