package com.boot.service.impl;

import com.boot.dao.FruitDao;
import com.boot.entity.Fruit;
import com.boot.service.FruitService;
import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wl on 2017/6/14.
 */
@Service
public class FruitServiceImpl implements FruitService {

//    @Autowired
//    private FruitDao fruitDao;
//
//    @Override
//    public List<Fruit> getAll() {
//        return fruitDao.all();
//    }
//
//    @Override
//    public Fruit getFruitById(int id) {
//        return fruitDao.unique(id);
//    }
//
//    @Override
//    public Fruit getFruitByName(String name) {
//        return fruitDao.selectFruitByName(name);
//    }
//
//    @Override
//    public int updateFruit(Fruit fruit) {
//        return fruitDao.updateById(fruit);
//    }
//
//    @Override
//    public KeyHolder addFruit(Fruit fruit) {
//        return fruitDao.insertReturnKey(fruit);
//    }
}
