package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * Does sum calculation
     * @param a
     * @param b
     * @return sum
     */

    @RequestMapping("/sum")
    public int sum(
            @RequestParam(name = "x") int a,
            @RequestParam int b
    ){
        return a + b;
    }

    @RequestMapping("/division")
    public int division(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a / b;
    }

    @RequestMapping("/multiplication")
    public int multiplication(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a * b;
    }

    @RequestMapping("/sub")
    public int sub(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a - b;
    }

    @RequestMapping("/exp")
    public double exp(
            @RequestParam int a,
            @RequestParam int b
    ){
        return Math.pow(a,b);
    }

    @RequestMapping("/absolut")
    public int absolut(
            @RequestParam int a
    ){
        return Math.abs(a);
    }

}
