package com.example.toby.ch01.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    // 수정자 메소드 DI
    // @Bean
    // public UserDao userDao() {
    //     UserDao userDao = new UserDao();
    //     userDao.setConnectionMaker(connectionMaker());
    //     return userDao;
    // }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

}
