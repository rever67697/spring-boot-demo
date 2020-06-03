/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.*;

import com.roncoo.education.bean.User;

/**
 * spring-boot-demo-4-1
 * 
 * @author wujing
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

	@RequestMapping
	public String index() {
		return "hello world";
	}

	// @RequestParam 简单类型的绑定，可以出来get和post
	@RequestMapping(value = "/get")
	@ResponseBody
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
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
