package com.company.springwebapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet() {
        return "Hello Spring Boot!!!";
    }

//    http://localhost:8080/hi/Shivam -> Hello Shivam
    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @PostMapping("/greet")
    public String postGreet() {
        return "Hello Post Spring Boot!!!";
    }

//    http://localhost:8080/bye?name=Shivam -> Bye Shivam
    @PostMapping("/bye")
    public String bye(@RequestParam("name") String name) {
        return "Bye " + name;
    }
}
