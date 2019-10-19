package com.startjava.lesson02.calculator;

import java.util.Scanner;

public class Calculator {

    private int num1;
    private int num2;
    private char operand;

    public void calc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = in.nextInt();
        System.out.print("Введите операнд: ");
        operand = in.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = in.nextInt();

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
                System.out.println(caption + (this.pow(num1, num2)));
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

    private int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}