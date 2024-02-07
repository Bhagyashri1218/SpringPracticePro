package com.cdac.curdoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.curdoperation.entity.JournalEntry;

@Repository
public interface JournalEntryRepo extends JpaRepository<JournalEntry, Integer>{

}
