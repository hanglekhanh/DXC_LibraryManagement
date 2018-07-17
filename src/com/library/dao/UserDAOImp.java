package com.library.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.entity.User;
@Repository
public class UserDAOImp implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkloging(String name, String pass) {
		User user = (User) sessionFactory.getCurrentSession().get(User.class, name);
		System.out.println(user.getUserName());
//		if(user != null) {
//			if(user.getPassWord().equals(pass)) {
//				return true;
//				
//			}
//			return false;
//			
//		}
		return false;
	}

	

	
	
	
}
