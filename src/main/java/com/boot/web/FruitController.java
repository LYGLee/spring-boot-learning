package com.boot.web;

import com.boot.entity.Fruit;
import com.boot.service.FruitService;
import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wl on 2017/6/14.
 */

@RestController
@RequestMapping("/fruit")
public class FruitController {

//    @Autowired
//    private FruitService fruitService;
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public List<Fruit> getFruits() {
//        return fruitService.getAll();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Fruit getFruitById(@PathVariable("id") int id) {
//        return fruitService.getFruitById(id);
//    }
//
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public Fruit getFruitByName(@RequestParam String name) {
//        return fruitService.getFruitByName(name);
//    }
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
//    public String updateFruit(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
//                              @RequestParam(value = "color", required = true) String color) {
//        Fruit fruit = new Fruit();
//        fruit.setColor(color);
//        fruit.setName(name);
//        fruit.setId(id);
//        int t = fruitService.updateFruit(fruit);
//        if (t == 1) {
//            return fruit.toString();
//        } else {
//            return "fail";
//        }
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String addFruit(@RequestParam(value = "name") String name,
//                              @RequestParam(value = "color") String color) {
//        Fruit fruit = new Fruit();
//        fruit.setColor(color);
//        fruit.setName(name);
//        KeyHolder t = fruitService.addFruit(fruit);
//        if (t.getInt() > 0) {
//            return fruit.toString();
//        } else {
//            return "fail";
//        }
//    }

}
