package com.walle.dao;


import com.walle.bean.Girl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTempleteDaoImpl implements JdbcTempleteDao {
    private JdbcTemplate jdbcTemplate;

    public List<Girl> getGirls() {
        String sql = "SELECT * FROM girl";
        final List<Girl> list = new ArrayList<Girl>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                    Girl girl = new Girl();
                    girl.setId(resultSet.getInt(1));
                    girl.setName(resultSet.getString(2));
                    girl.setCupSize(resultSet.getString(3));
                    girl.setAge(resultSet.getInt(4));
                    list.add(girl);
            }
        });
        return list;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
