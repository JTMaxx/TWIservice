package Server.Controller;

import Server.Model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CustomerClientController {

    @GetMapping("/customer")
    public String customer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    //todo: Do we need here @PostMapping to push data to database?
}


// todo: Tell the difference between @RequestMapping and @GetMapping
// @Controller
// public class....
//
//    @GetMapping("/greeting")
//    public String greetingForm(Model model) {
//        model.addAttribute("greeting", new Greeting());
//        return "greeting";

