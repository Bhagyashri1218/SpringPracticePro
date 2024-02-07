package com.cdac.curdoperation.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.curdoperation.entity.JournalEntry;
import com.cdac.curdoperation.repository.JournalEntryRepo;

@Service
public class JournalEntryService {

	@Autowired
	private JournalEntryRepo entryRepo;
	
	public void saveEntry(JournalEntry entry) {
		entryRepo.save(entry);
	}
	
	public List<JournalEntry> getAll(){
		return entryRepo.findAll();
	}
	
	public Optional<JournalEntry> getrecordByid(Integer id) {
		return entryRepo.findById(id);
		
	}
	
	public void deleteById(Integer id) {
		entryRepo.deleteById(id);
	}
	
}
