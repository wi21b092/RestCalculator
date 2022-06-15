package com.example.restcalculator;

public class Calculator {

    public int sum (int a, int b){
        return a+b;
    }

    public int division (int a, int b){
        return a/b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public double exp(int a, int b){
        return Math.pow(a,b);
    }
    public int absolut(int a){
        return Math.abs(a);
    }
    public double sqrt(int a){
        return Math.sqrt(a);
    }
}
