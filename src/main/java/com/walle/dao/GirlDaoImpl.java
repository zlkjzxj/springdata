package com.walle.dao;

import com.walle.bean.Girl;
import com.walle.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GirlDaoImpl implements GirlDao {
    public List<Girl> getGirls() {
        Connection connection = null;
        List<Girl> list = new ArrayList<Girl>();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM girl";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Girl girl = new Girl();
                girl.setId(resultSet.getInt(1));
                girl.setName(resultSet.getString(2));
                girl.setCupSize(resultSet.getString(3));
                girl.setAge(resultSet.getInt(4));
                list.add(girl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return list;
    }
}
