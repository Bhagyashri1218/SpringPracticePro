package com.cdac.curdoperation.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class JournalEntry {

	@Id
	private String id;

	private String title;
	private String content;

	@CreationTimestamp
	private Timestamp timestamp;

}
