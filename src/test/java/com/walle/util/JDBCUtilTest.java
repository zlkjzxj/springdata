package com.walle.util;

import junit.framework.Assert;
import org.junit.Test;

import java.sql.Connection;

public class JDBCUtilTest {

    @Test
    public void testConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}
