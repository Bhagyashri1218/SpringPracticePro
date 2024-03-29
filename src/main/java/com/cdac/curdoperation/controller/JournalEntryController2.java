package com.cdac.curdoperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.curdoperation.controller.service.JournalEntryService;
import com.cdac.curdoperation.entity.JournalEntry;

@RestController
@RequestMapping("/journalEntry")
public class JournalEntryController2 {

	@Autowired
	private JournalEntryService entryService;

	@GetMapping("/{username}")
	public ResponseEntity<List<JournalEntry>> getAll(@PathVariable String username) {
		List<JournalEntry> optional = entryService.getAll();
		if (optional != null && !optional.isEmpty()) {
			return new ResponseEntity<>(optional, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("id/{myid}")
	public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable Integer myid) {
		Optional<JournalEntry> optional = entryService.getrecordByid(myid);
		if (optional.isPresent()) {
			return new ResponseEntity<>(optional.get(), HttpStatus.OK);

		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping
	public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry entry) {
		try {
			entryService.saveEntry(entry);
			return new ResponseEntity<>(entry, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("id/{myid}")
	public ResponseEntity<?> deleteJournalEntryById(@PathVariable Integer myid) {
		entryService.deleteById(myid);
		return new ResponseEntity<JournalEntry>(HttpStatus.NO_CONTENT);
	}

	@PutMapping("id/{id}")
	public ResponseEntity<?> updateentry(@PathVariable Integer id, @RequestBody JournalEntry entry) {
		JournalEntry entry2 = entryService.getrecordByid(id).orElse(null);
		System.err.println("entry " + entry);
		System.err.println("entry old " + entry2);
		if (entry2 != null) {
			entry2.setTitle(
					entry.getTitle() != null && !entry.getTitle().equals("") ? entry.getTitle() : entry2.getTitle());
			entry2.setContent(entry.getContent() != null && !entry.getContent().equals("") ? entry.getContent()
					: entry2.getContent());
			entryService.saveEntry(entry2);
			return new ResponseEntity<>(entry2, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
}
