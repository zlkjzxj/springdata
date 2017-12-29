package com.walle.dao;

import com.walle.bean.Girl;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

public class JdbcTempleteDaoImplTest {
    private ApplicationContext context = null;
    JdbcTempleteDao jdbcTemplateDao = null;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext("spring.xml");
        jdbcTemplateDao = (JdbcTempleteDao) context.getBean("jdbcTemplateDao");
        System.out.println("setup");
    }
    @Test
    public void getGirls() {
        List<Girl> list = jdbcTemplateDao.getGirls();
        for (Girl girl : list) {
            System.out.println(girl.toString());
        }
    }

    @After
    public void tearDown() {
        context = null;
        System.out.println("tearDown");
    }



}