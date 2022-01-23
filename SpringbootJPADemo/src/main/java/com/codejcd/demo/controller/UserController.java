package com.codejcd.demo.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codejcd.demo.bean.User;
import com.codejcd.demo.service.UserService;

@RestController
public class UserController {
	
    @Autowired
    UserService userService;
    
    @RequestMapping("list")
    public List<User> userlist() {
    	return userService.findAll();
    }
    
    @RequestMapping("name/{name}")
    public List<User> userFindByName(@PathVariable String name) {
    	return userService.findByName(name);
    }
    
    @RequestMapping("insert")
    public User userInsert(@ModelAttribute User user) {
    	userService.save(user);
    	return user;
    }
    
    @RequestMapping("delete")
    public User userDelete(@ModelAttribute User user) {
    	userService.delete(user);
    	return user;
    }
    
    @RequestMapping("update")
    public User userUpdate(@ModelAttribute User user) {
    	userService.save(user);
    	return user;
    }

}