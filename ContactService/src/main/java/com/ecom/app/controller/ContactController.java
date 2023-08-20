package com.ecom.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.app.model.Contact;
import com.ecom.app.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@GetMapping("/user/{userId}")
	public List<Contact> getContactDetails(@PathVariable("userId") Long userId){
		return contactService.getContactsOfUser(userId);
	}
	
	@PostMapping
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}
	
	@GetMapping("/{contactId}")
	public Contact getContactById(@PathVariable Long contactId) {
		return contactService.getContactById(contactId);
	}
	
	@GetMapping("/getAll")
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@DeleteMapping("/contactId")
	public void deleteContactById(Long contcatId){
		contactService.deleteContactById(contcatId);
	}
}