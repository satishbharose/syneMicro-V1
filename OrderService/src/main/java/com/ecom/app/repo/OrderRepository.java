package com.ecom.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.app.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
