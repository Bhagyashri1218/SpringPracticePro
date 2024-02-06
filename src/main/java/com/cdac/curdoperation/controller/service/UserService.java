package com.cdac.curdoperation.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.curdoperation.entity.Users;
import com.cdac.curdoperation.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo entryRepo;
	
	public void saveEntry(Users entry) {
		entryRepo.save(entry);
	}
	
	public List<Users> getAll(){
		return entryRepo.findAll();
	}
	
	public Users getrecordByid(String id) {
		return entryRepo.findById(id).orElse(null);
		
	}
	
	public void deleteById(String id) {
		entryRepo.deleteById(id);
	}
	
}
