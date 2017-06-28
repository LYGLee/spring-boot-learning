package com.boot.dao;

import com.boot.entity.Fruit;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Created by wl on 2017/6/13.
 */
public interface FruitDao extends BaseMapper<Fruit> {

//    @SqlStatement(params = "name")
//    Fruit selectFruitByName(String name);
}
