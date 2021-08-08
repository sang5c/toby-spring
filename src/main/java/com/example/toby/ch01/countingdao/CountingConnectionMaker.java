package com.example.toby.ch01.countingdao;

import com.example.toby.ch01.dao.ConnectionMaker;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {

    int counter = 0;
    private ConnectionMaker connectionMaker;

    public CountingConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    @Override
    public Connection makeConnection() throws SQLException {
        this.counter++;
        return connectionMaker.makeConnection();
    }

    public int getCounter() {
        return this.counter;
    }

}
