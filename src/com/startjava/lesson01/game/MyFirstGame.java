package com.startjava.lesson01.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int question = 25; // 0-100
        int answer = 5;

        while (answer != question) {
            if (answer > question) {
                System.out.println("You answer " + answer + " too big");
                answer--;
            } else {
                System.out.println("You answer " + answer + " too small");
                answer++;
            }

            // TO DO здесь должен быть ввод с клавиатуры

        }
        System.out.println("You win!");
    }
}
