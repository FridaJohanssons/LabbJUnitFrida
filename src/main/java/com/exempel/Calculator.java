package com.exempel;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Adding 5 + 5 = " + new Calculator().add(5,5));
        System.out.println("subtract 5 - 5 = " + new Calculator().sub(5,5));
        System.out.println("Multiply 5 * 5 = " + new Calculator().multi(5,5));
        System.out.println("Divide 5 / 5 = " + new Calculator().div(5,5));

    }
    public int add (int num1, int num2){
        return num1 + num2;
    }
    public int sub (int num1, int num2){
        return num1 - num2;
    }
    public int multi (int num1, int num2){
        return num1 * num2;
    }
    public int div (int num1, int num2){
        return num1 / num2;
    }
}
