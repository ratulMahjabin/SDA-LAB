package com.example.customerservice.repositories;

import com.example.customerservice.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {


    Customer findCustomerById(String id);
}
