package com.walle.dao;

import com.walle.bean.Girl;

import java.util.List;

public interface MybatisDao {
    public List<Girl> getGirls();
    public int updateGirls(List<Integer> ids);
    public int deleteGirls(List<Integer> ids);
}
