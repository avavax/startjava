package com.startjava.lesson02.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        String accept;

        do {
            calculator.calc();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                accept = in.nextLine();
            } while (!accept.equals("да") && !accept.equals("нет"));
        } while (accept.equals("да"));

    }
}