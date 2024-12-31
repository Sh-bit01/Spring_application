package com.example.demo;
//its an Modle class 

public class Request {
    private double num1;
    private double num2;
    private String calculation;  // This will store the type of calculation (e.g., "add", "sub")

    // Getters and Setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
     public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }
    
}

