package com.example.toby.ch01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }

}
