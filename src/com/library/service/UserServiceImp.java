package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.UserDAO;
import com.library.entity.User;
@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserDAO userDao;
	
	@Transactional
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
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
	@Transactional
	@Override
	public boolean checkloging(String name, String pass) {
		// TODO Auto-generated method stub
		return userDao.checkloging(name, pass);
	}

}
