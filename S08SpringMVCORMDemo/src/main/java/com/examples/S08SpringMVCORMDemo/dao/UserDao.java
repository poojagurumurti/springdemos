package com.examples.S08SpringMVCORMDemo.dao;

import java.util.List;

import com.examples.S08SpringMVCORMDemo.entity.User;

public interface UserDao {
	int create(User user);
	List<User> findUsers();
	User findUser(String email);
}
