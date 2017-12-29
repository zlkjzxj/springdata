package com.walle.dao;

import com.walle.bean.Girl;
import com.walle.util.MybatisDb;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class MybatisDaoImpl implements MybatisDao {
    public List<Girl> getGirls() {
        MybatisDb mybatisDb = new MybatisDb();
        SqlSession sqlSession = null;
        List<Girl> list = new ArrayList<Girl>();
        try {
            sqlSession = mybatisDb.getsqlSession();
            String sql = "Girl.findGirls";
            list = sqlSession.selectList(sql);
            Girl girl = sqlSession.selectOne("findOneGirl", 1);
            System.out.println(girl.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return list;
    }

    public int updateGirls(List<Integer> ids) {
        MybatisDb mybatisDb = new MybatisDb();
        SqlSession sqlSession = null;
        List<Girl> list = new ArrayList<Girl>();
        int code = 0;
        try {
            sqlSession = mybatisDb.getsqlSession();
            String sql = "Girl.updateGirls";
            code = sqlSession.update(sql, ids);
            //必须有下面这句，因为mybsits 把commit设置成false了
            sqlSession.commit();
            System.out.println(code);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null && !"".equals(sqlSession)) {
                sqlSession.close();
            }
        }
        return code;
    }

    public int deleteGirls(List<Integer> ids) {
        MybatisDb mybatisDb = new MybatisDb();
        SqlSession sqlSession = null;
        List<Girl> list = new ArrayList<Girl>();
        int code = 0;
        try {
            sqlSession = mybatisDb.getsqlSession();
            String sql = "Girl.deleteGirls";
            code = sqlSession.delete(sql, ids);
            sqlSession.commit();
            System.out.println(code);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return code;
    }
}
