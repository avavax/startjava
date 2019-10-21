package com.startjava.lesson04.calculator;

import java.util.Scanner;

public class Calculator {

    public void calc() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String[] str = in.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        char operand = str[1].charAt(0);

        String caption = num1 + " " + operand + " " + num2 + " = ";

        switch (operand) {
            case '+':
                System.out.println(caption + (num1 + num2));
                break;
            case '*':
                System.out.println(caption + (num1 * num2));
                break;
            case '-':
                System.out.println(caption + (num1 - num2));
                break;
            case '^':
                System.out.println(caption + (Math.pow(num1, num2)));
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Деление на ноль!");
                } else {
                    System.out.println(caption + (num1 % num2));
                }
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на ноль!");
                } else {
                    System.out.println(caption + (num1 / num2));
                }
                break;
            default: System.out.println("Некорректные данные");
        }
    }

}