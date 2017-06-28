package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by wl on 2017/6/14.
 */
@Mapper
@Repository
public interface AccountMapper2 {
    int update(@Param("money") double money, @Param("id") int  id);
}
