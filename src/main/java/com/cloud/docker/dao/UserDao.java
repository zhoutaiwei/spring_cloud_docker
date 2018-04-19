package com.cloud.docker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.docker.POJO.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	
}
