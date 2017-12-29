package com.walle.dao;

import com.walle.bean.Klass;
import com.walle.util.MybatisDb;
import org.apache.ibatis.session.SqlSession;

public class KlassDaoImpl implements KlassDao {
    public Klass getOneKlas() {
        MybatisDb mybatisDb = new MybatisDb();
        SqlSession sqlSession = null;
        Klass klass = new Klass();
        try {
            sqlSession = mybatisDb.getsqlSession();
            String sql = "Klass.queryClass";

            klass.setId(1);
            klass = sqlSession.selectOne(sql, klass);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return klass;
    }
}
