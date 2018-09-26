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
//    private static final Logger myLog = LoggerFactory.getLogger(Main.class);


    @Autowired //todo: What it does exactly?
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/customer")
    public String createCustomer(Customer customer) { // skasowalem parametr Model model i wszystko działa. Nie byl uzywany w metodzie, pewnie dlatego.
        customerRepository.save(customer);
//                // show records from repo
//        myLog.info("");
//        myLog.info("Customers found with findAll():");
//        myLog.info("-------------------------------");
//        for (Customer customerEmpty : customerRepository.findAll()) {
//            myLog.info(customerEmpty.toString());
//        }
//        myLog.info("");
        return "customer";
    }

    @GetMapping("/customers")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll()); //Ten atrybut jest potem używany przez thymeleaf do wyswietlania wynikow
                                                                            // w pierwszym argumentem w addAtribute() jest nazwa nowej zmiennej, a w drugim jej inicjalizacja
        return "customers";
    }
}

