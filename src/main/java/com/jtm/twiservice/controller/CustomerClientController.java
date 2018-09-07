package com.jtm.twiservice.controller;

import com.jtm.twiservice.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerClientController {

    @GetMapping("/customer")
    public String customer(Model model) {

        model.addAttribute("customer", new Customer());
//        List<String> birthYears = customerObj.;
//        model.addAttribute("countries", list);
        return "customer";
    }


    //todo: Do we need here @PostMapping to push data to database?
}


// todo: Tell the difference between @RequestMapping and @GetMapping
// @controller
// public class....
//
//    @GetMapping("/greeting")
//    public String greetingForm(model model) {
//        model.addAttribute("greeting", new Greeting());
//        return "greeting";

