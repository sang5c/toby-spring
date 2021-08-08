package com.example.toby.ch01.countingdao;

import com.example.toby.ch01.User;
import com.example.toby.ch01.countingdao.CountingConnectionMaker;
import com.example.toby.ch01.countingdao.CountingDaoFactory;
import com.example.toby.ch01.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoConnectionCountingTest {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        // dao 사용
        User user = new User();
        user.setId("1");
        user.setName("2");
        user.setPassword("3");
        dao.add(user);

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("connection counter : " + ccm.getCounter());
    }
}
