package com.walle.dao;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class springDaoTest {
    private ApplicationContext context = null;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("setup");
    }

    @Test
    public void testSpringJdbc() {
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Assert.assertNotNull(dataSource);
    }
    @Test
    public void testTemplete() {
       JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplete");
       Assert.assertNotNull(jdbcTemplate);
    }

    @After
    public void tearDown() {
        context = null;
        System.out.println("tearDown");
    }
}
