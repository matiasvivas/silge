package com.howtodoinjava.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication 
public class SpringBootSilgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSilgeApplication.class, args);
    }
}
