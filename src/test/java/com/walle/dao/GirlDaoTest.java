package com.walle.dao;

import com.walle.bean.Girl;
import org.junit.Test;

import java.util.List;

public class GirlDaoTest {

    @Test
    public void testQuery() {
        GirlDao girlDao = new GirlDaoImpl();
        List<Girl> list = girlDao.getGirls();
        for (Girl girl : list) {
            System.out.println(girl.toString());
        }
    }
}
