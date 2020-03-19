package com.cg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.entity.UserDetail;

@Repository
public interface UserLoginDao extends JpaRepository<UserDetail, String>{

	
}
