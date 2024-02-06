package com.cdac.curdoperation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	@Id
	private String username;
	@Column(nullable = false)
	private String password;

//	@ElementCollection
//	private List<JournalEntry> journalEntries;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private List<JournalEntry> journalEntries;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<JournalEntry> getJournalEntries() {
		return journalEntries;
	}

	public void setJournalEntries(List<JournalEntry> journalEntries) {
		this.journalEntries = journalEntries;
	}

}
