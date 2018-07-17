package com.library.dao;

import java.util.List;

import com.library.entity.User;

public interface UserDAO {
	
	public void addUser(User user);
	public User getUserByName(String userName);
	public void deleteUser(String userName);
	public void updateUser(String userName);
	public List<User> getAllUser();
	public boolean checkloging(String name , String pass);
}
