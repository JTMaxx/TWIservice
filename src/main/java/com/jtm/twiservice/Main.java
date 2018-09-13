package com.jtm.twiservice;

import com.jtm.twiservice.model.Customer;
import com.jtm.twiservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @Bean
    public static CommandLineRunner demo2(CustomerRepository repository) {
        return (args) -> {
            log.info("Customers found with findAll():");
            log.info("----------------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX---------------");

//            for (Customer customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
            log.info("");
        };
    }
}