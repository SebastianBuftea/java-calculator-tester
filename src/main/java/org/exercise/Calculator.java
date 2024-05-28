package org.exercise;

public class Calculator {

    public static float add(float num1, float num2){
        return num1+num2;
    }
    public float substract(float num1, float num2){
        return num1-num2;
    }
    public float divide(float num1, float num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }        return num1/num2;
    }
    public float multiply(float num1, float num2){
        return num1*num2;
    }
}

