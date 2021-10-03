CREATE DATABASE sampleDB;

CREATE TABLE users(
    user_id BIGSERIAL NOT NULL,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    fullname VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL
);