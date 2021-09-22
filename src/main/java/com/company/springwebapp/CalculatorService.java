package com.company.springwebapp;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int subtract(int n1, int n2) {
        return n1-n2;
    }

    public int product(int n1, int n2) {
        return n1*n2;
    }

    public int square(int n1) {
        return n1*n1;
    }
}
