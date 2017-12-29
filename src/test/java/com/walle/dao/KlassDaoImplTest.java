package com.walle.dao;

import com.walle.bean.Klass;
import com.walle.bean.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlassDaoImplTest {

    @Test
    public void getOneKlas() {
        KlassDao klassDao = new KlassDaoImpl();
        Klass klass = klassDao.getOneKlas();
        System.out.println(klass.getName());
        if (klass != null) {
            for (Student student : klass.getStudentList()) {
                System.out.println(student.getName());
            }
        }
    }
}