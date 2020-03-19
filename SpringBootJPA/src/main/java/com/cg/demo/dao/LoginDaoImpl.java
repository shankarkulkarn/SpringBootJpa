package com.cg.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.demo.entity.UserDetail;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	EntityManager  entityManager;
	
	@Override
	public boolean validate(UserDetail userDetail) {
		
		UserDetail user =entityManager.find(UserDetail.class,userDetail.getUserName());
		boolean  flag  = false;
		if( user != null)
		{
			if( user.getUserPass().equals( userDetail.getUserPass()))
			{
				 flag= true;
			}
		}
		
		
		return flag;
	}

}
