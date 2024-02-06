/*
 * package com.cdac.curdoperation.controller;
 * 
 * import java.util.ArrayList; import java.util.HashMap; import java.util.List;
 * import java.util.Map;
 * 
 * import org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.cdac.curdoperation.entity.JournalEntry;
 * 
 * @RestController
 * 
 * @RequestMapping("/journal") public class JournalEntryController {
 * 
 * private Map<Long,JournalEntry> journalEntry = new HashMap(); //journalEntry.
 * 
 * @GetMapping public List<JournalEntry> getAll(){ return new
 * ArrayList<>(journalEntry.values()); }
 * 
 * @GetMapping("id/{myid}") public JournalEntry
 * getJournalEntryById(@PathVariable long myid) { return journalEntry.get(myid);
 * }
 * 
 * @PostMapping public boolean createEntry(@RequestBody JournalEntry entry) {
 * journalEntry.put(entry.getId(),entry); return true; }
 * 
 * @DeleteMapping("id/{myid}") public JournalEntry
 * deleteJournalEntryById(@PathVariable long myid) { return
 * journalEntry.remove(myid); }
 * 
 * @PutMapping("id/{id}") public JournalEntry updateentry(@PathVariable long
 * id,@RequestBody JournalEntry entry) { return journalEntry.put(id,entry); } }
 */