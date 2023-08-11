package com.furlencoapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.furlencoapp.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	@Query("{name:?0}")
    Customer findByCustomerName(String customerName);
}

