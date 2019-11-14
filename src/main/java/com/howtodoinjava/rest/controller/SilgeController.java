package com.howtodoinjava.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
@RequestMapping(path = "/app")
public class SilgeController {

    @GetMapping(path = "/getStatus", produces = "application/json")
    public Integer getStatus() {
        Integer contenido = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/u405681551_silge?serverTimezone=UTC", "u405681551_admin", "parana2000");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pruebas");
            while (rs.next()) {
                contenido = rs.getInt("id");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return contenido;
    }

}
