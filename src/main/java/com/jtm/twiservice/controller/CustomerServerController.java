package pl.kubson.twiservice.controller;

import pl.kubson.twiservice.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CustomerServerController {
    private static final String template = "Customer's name is %s";
    private static final AtomicLong customerIdCounter = new AtomicLong();

    @RequestMapping("/customerJSON")
    public Customer customer(@RequestParam(value = "firstName", defaultValue = "PUT NAME IN URL") String firstName) {
        return new Customer(customerIdCounter.getAndIncrement(), String.format(template, firstName));
    }
}


// todo: Tell the difference between @RequestMapping and @GetMapping
// @controller
// public class....
//
//    @GetMapping("/greeting")
//    public String greetingForm(model model) {
//        model.addAttribute("greeting", new Greeting());
//        return "greeting";

