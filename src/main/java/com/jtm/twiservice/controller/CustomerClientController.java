package com.jtm.twiservice.controller;

import com.jtm.twiservice.Features;
import com.jtm.twiservice.Main;
import com.jtm.twiservice.model.Customer;
import com.jtm.twiservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerClientController {
    private static final Logger simpleLog = LoggerFactory.getLogger(Main.class);


    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        simpleLog.info("MMMMMMMMMM@GetMapping(\"/customer\")MMMMMMMMMM");
        Features.demo(customerRepository);

        return "customer";
    }
//    @PostMapping("/customer")
//    public String customerSubmit(@ModelAttribute Customer customer) {
////        customerRepository.save(customer);
//        simpleLog.info("MMMMMMMMMM@PostMapping(\"/customer\")MMMMMMMMMM");
//        Features.demo(customerRepository);
//
//        return "redirect:/customer/" + customer.getId();
////        return "result";
//    }

    @GetMapping("/customer/{id}")       //todo: po odkomentowaniu nie dziala polaczenie z css-em z powodu @GetMapping("/customer/{id}") pewnie
    public String getCustomerById(@PathVariable Long id, Model model) {
        model.addAttribute("customer", customerRepository.findById(id).orElse(new Customer()));

        simpleLog.info("UUUUUUUUUUCustomers found with findAll():UUUUUUUUUUUUUUUUUU");
        simpleLog.info("-------------------------------");
        for (Customer customer : customerRepository.findAll()) { //COPIED FROM FEATURES, CHANGED: repository -> customerRepository
            simpleLog.info(customer.toString());
        }
        simpleLog.info("");
        simpleLog.info("MMMMMMMMMM @GetMapping(\"/customer/{id}\")  MMMMMMMMMM");

        return "customer";
    }

    //written analogically on my own
    @PostMapping("/customer")
    public String createCustomer(Customer customer, Model model) {
        customerRepository.save(customer);
//        return "customer";
        //Features.demo(customerRepository);
        simpleLog.info("MMMMMMMMMM @PostMapping(\"/customer/\")MMMMMMMMMM");
        return "redirect:/customer/" + customer.getId();
    }



}

