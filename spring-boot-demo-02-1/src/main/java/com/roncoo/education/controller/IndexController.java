/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.controller;

import com.roncoo.education.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * spring-boot-demo-2-1
 *
 * @author wujing
 */
@RestController
@RequestMapping(value = "/index",produces = "application/json;charset=UTF-8")
public class IndexController {

    @RequestMapping
    public String index() {
        return "hello world";
    }

    // @RequestParam 简单类型的绑定，可以出来get和post
    @RequestMapping(value = "/a",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String, Object> get(@RequestParam String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("title", "hello world");
        map.put("name", name);
        return map;
    }

    // @PathVariable 获得请求url中的动态参数
    @RequestMapping(value = "/get/{id}/{name}")
    public User getUser(@PathVariable int id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        return user;
    }

}
