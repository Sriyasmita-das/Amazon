package com.amz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login {
	@Id
	@Column
	private int id;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private int age;
	@Column
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getUsername() {
		return username;
	}
	public void SetUsername(String username) {
		this.username=username;
	}
	public String getEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email=email;
	}
	public int getAge() {
		return age;
	}
	public void SetAge(int age) {
		this.age=age;
	}
	

}
