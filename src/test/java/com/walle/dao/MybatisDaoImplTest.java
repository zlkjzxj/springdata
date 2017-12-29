package com.walle.dao;

import com.walle.bean.Girl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MybatisDaoImplTest {
    @Test
    public void testMybatisQuery() {
        MybatisDao mybatisDao = new MybatisDaoImpl();
        List<Girl> list = mybatisDao.getGirls();
        for (Girl girl : list) {
            System.out.println(girl.toString());
        }
    }

    @Test
    public void updateGirls() {
        MybatisDao mybatisDao = new MybatisDaoImpl();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(mybatisDao.updateGirls(list));
    }

    @Test
    public void deleteGirls() {
        MybatisDao mybatisDao = new MybatisDaoImpl();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(mybatisDao.deleteGirls(list));
    }
}