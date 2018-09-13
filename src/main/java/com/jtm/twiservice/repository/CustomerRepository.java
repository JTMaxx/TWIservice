package com.jtm.twiservice.repository;

import com.jtm.twiservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //List<Customer> findByLastName(String lastName);
}
