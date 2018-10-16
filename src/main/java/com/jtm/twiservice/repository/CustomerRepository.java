package com.jtm.twiservice.repository;

import com.jtm.twiservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
