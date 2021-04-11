package com.example.backend.api;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("add-two-numbers/{a},{b}")
    public Integer addTwoNumbers(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }

}
