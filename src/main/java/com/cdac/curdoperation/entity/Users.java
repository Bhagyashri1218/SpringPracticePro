package com.cdac.curdoperation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	@Id
	private String username;

	@Column(nullable = false)
	private String password;

	@OneToMany(targetEntity = JournalEntry.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_username", referencedColumnName = "username")
	private List<JournalEntry> journalEntries;

}
