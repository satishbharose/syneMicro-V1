package com.ecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.app.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
}