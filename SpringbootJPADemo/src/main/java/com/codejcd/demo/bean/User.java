package com.codejcd.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id // 해당 프로퍼티가 Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key 생성을 DB에 위임
	private Long id;
	
	@Column(length = 20, nullable = false) // 길이 20 제한, not null
	private String name;
	
	@Column(length = 20, nullable = false, unique = true) // 길이 20 제한, Not Null, Unique key
	private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}