package com.walle.dao;

import com.walle.bean.Girl;
import java.util.List;

public interface JdbcTempleteDao {
    public List<Girl> getGirls();
}
