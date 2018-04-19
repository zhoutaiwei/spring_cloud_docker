package com.cloud.docker.POJO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String uername;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private BigDecimal balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUername() {
		return uername;
	}
	public void setUername(String uername) {
		this.uername = uername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public User(Long id, String uername, String name, Integer age, BigDecimal balance) {
		super();
		this.id = id;
		this.uername = uername;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uername=" + uername + ", name=" + name + ", age=" + age + ", balance=" + balance
				+ "]";
	}
	
}
