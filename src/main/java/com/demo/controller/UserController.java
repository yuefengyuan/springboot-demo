package com.demo.controller;

import com.demo.domain.dao.UserRepository;
import com.demo.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Ege
 */

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/getuser")
	@Cacheable(value="user-key")
	public User getUser() {
		User user=userRepository.findByUserName("alex");

		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");

		return user;
	}
}
