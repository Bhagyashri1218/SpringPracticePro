package com.cdac.curdoperation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Users {

	@Id
	private String username;

	@Column(nullable = false)
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private List<JournalEntry> journalEntries;

}
