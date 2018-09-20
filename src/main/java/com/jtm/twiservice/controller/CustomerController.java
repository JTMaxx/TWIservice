package com.jtm.twiservice.controller;

import com.jtm.twiservice.Main;
import com.jtm.twiservice.model.Customer;
import com.jtm.twiservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    private static final Logger myLog = LoggerFactory.getLogger(Main.class);


    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        myLog.info("\t\t\t\t\t\tGetMapping(\"/customer\")");
        return "customer";
    }

    @PostMapping("/customer")
    public String createCustomer(Customer customer, Model model) {
        customerRepository.save(customer);
                // show records from repo
        myLog.info("");
        myLog.info("Customers found with findAll():");
        myLog.info("-------------------------------");
        for (Customer customerEmpty : customerRepository.findAll()) {
            myLog.info(customerEmpty.toString());
        }
        myLog.info("");
        return "customer";
    }

    @GetMapping("/customers")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customers";
    }
}

