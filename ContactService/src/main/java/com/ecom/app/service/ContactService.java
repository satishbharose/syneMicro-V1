package com.ecom.app.service;

import java.util.List;

import com.ecom.app.model.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
	public Contact getContactById(Long contactId);
	public List<Contact> getAllContacts();
	public void deleteContactById(Long contactId);
	public Contact addContact(Contact contact);
}