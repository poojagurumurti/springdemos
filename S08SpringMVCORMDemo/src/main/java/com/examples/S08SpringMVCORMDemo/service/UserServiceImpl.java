package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S08SpringMVCORMDemo.dao.UserDao;
import com.examples.S08SpringMVCORMDemo.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		
//		if(user.getEmail() already exists){
//			throw an exception
//		}
		if(userdao.findUser(user.getEmail())!=null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}

	
	
	

}
