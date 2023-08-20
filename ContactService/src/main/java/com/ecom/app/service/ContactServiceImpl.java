package com.ecom.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.app.model.Contact;
import com.ecom.app.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	List<Contact> contactLst = List.of(
			new Contact(1L, "satishcontact@gmail.com", "Satish B Contact", 101L),
			new Contact(2L, "bharosecontact@gmail.com", "Bharose B Contact", 101L),
			new Contact(3L, "dardecontact@gmail.com", "Darde P Contact", 102L));
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return contactLst.stream()
				.filter(contact -> contact.getContUsr() == userId)
				.collect(Collectors.toList());
	}

	@Override
	public Contact getContactById(Long contactId) {
		return contactRepository.findById(contactId).get();
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	public void deleteContactById(Long contactId) {
		contactRepository.deleteById(contactId);
	}

	@Override
	public Contact addContact(Contact contact) {
		return contactRepository.save(contact);
	}

}