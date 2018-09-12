package com.jtm.twiservice;

import com.jtm.twiservice.model.Customer;
import com.jtm.twiservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Features {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    //@Bean
    public static CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");
        };
    }
}
