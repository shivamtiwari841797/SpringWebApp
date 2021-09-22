package com.company.springwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calc/add/{n1}/{n2}")
    public String add(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        return String.valueOf(calculatorService.add(n1, n2));
    }

    @GetMapping("/calc/square/{n1}")
    public String square(@PathVariable("n1") int n1) {
        return String.valueOf(calculatorService.square(n1));
    }

    @PutMapping("/calc/subtract/{n1}/{n2}")
    public String subtract(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        return String.valueOf(calculatorService.subtract(n1, n2));
    }

    @PostMapping("/calc/product")
    public String product(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return String.valueOf(calculatorService.product(n1, n2));
    }

}
