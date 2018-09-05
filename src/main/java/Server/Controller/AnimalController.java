package Server.Controller;

import Server.Model.Animal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AnimalController {
    private static final String template = "This is a(n) %s";
    private static final String mammalTemplate = "This is a(n) %s!  It has %s legs.";
    private final AtomicLong counter = new AtomicLong(1000);
    private final int limbsNumber = 4;
    private final String size = "small";

    @RequestMapping("/animal")
    public Animal animal(@RequestParam(value = "animalName", defaultValue = "Animalson") String animalName) {
        return new Animal(counter.incrementAndGet(), String.format(template, animalName));
    }

    @RequestMapping("/mammal")
    public Animal mammal(@RequestParam(value = "mammalName", defaultValue = "Mammalson") String mammalName,
                         @RequestParam(value = "limbsNumber", defaultValue = "4") int limbsNumber) {
        return new Animal(String.format(mammalTemplate, mammalName, limbsNumber), limbsNumber, size);
    }





}
