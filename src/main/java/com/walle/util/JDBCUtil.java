package com.walle.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    public static Connection getConnection() throws Exception {
        InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        String url = properties.getProperty("jdbc.url");
        String name = properties.getProperty("jdbc.name");
        String password = properties.getProperty("jdbc.password");
        String driver = properties.getProperty("jdbc.driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, name, password);
        return connection;
    }

    public static void release(ResultSet resultSet, Statement statement, Connection connection) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                resultSet.close();
            }
            if (connection != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
