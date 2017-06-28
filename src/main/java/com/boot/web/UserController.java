package com.boot.web;

import com.boot.config.ConfigBean;
import com.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wl on 2017/6/21.
 */

@Controller
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class UserController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        return "welcome to study Spring boot";
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user() {
        return user.getName() + user.getAge();
    }

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    @ResponseBody
    public String miya() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap) {
        // 加入一个属性，用来在模板中读取
        modelMap.addAttribute("host", "https://www.baidu.com/");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;

    @RequestMapping(value = "/my")
    @ResponseBody
    public String getMyself() {
        return "my name is " + name + ", age is " + age;
    }


}
