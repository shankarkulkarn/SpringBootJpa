package com.cg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.LoginDao;
import com.cg.demo.dao.UserLoginDao;
import com.cg.demo.entity.UserDetail;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserLoginDao  loginDao;
	
	@Override
	public boolean validate(UserDetail userDetail) {
		
		return  loginDao.existsById(userDetail.getUserName());
	}

}
