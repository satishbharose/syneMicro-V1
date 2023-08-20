package com.ecom.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
