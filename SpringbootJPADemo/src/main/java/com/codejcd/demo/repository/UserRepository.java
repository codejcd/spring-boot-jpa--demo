package com.codejcd.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codejcd.demo.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findByName(String name);
	public List<User> findByPhone(String phone);
	
}
