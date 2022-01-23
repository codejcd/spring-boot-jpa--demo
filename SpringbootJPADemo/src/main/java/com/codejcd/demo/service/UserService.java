package com.codejcd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejcd.demo.bean.User;
import com.codejcd.demo.repository.UserRepository;


@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;
    
	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
	
}
