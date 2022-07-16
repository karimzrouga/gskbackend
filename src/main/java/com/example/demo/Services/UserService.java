package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

@Service
public class UserService extends Abstarctservices<User> {
	@Autowired
	private com.example.demo.Repository.UserRepository  UserRepository;

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}

	@Override
	public Optional<User> findbyid(int id) {
		// TODO Auto-generated method stub
		return UserRepository.findById(id);
	}
	public User findemail (String email) {
		
		return UserRepository.findByEmail(email);
	}
	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		UserRepository.deleteById(id);
		return true;
	}

	@Override
	public User update(User a) {
		// TODO Auto-generated method stub
		return UserRepository.save(a);
	}

	@Override
	public User create(User a) {
		// TODO Auto-generated method stub
		return UserRepository.save(a);
	}

}