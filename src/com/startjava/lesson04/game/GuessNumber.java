package com.startjava.lesson04.game;

import java.util.Scanner;

public class GuessNumber {

    private Player[] players = new Player[2];
    private Scanner in;

    public GuessNumber(Player playerOne, Player playerTwo) {
        players[0] = playerOne;
        players[1] = playerTwo;
        in = new Scanner(System.in);
    }

    public void run() {
        int MAX_STEP = 10;
        int answer;
        int question = getQuestion();
        int side = 0;
        int step = 1;
        boolean finish = false;
        players[0].setNull();
        players[1].setNull();

        System.out.println("У вас " + MAX_STEP + " попыток");

        do {
            System.out.println("Ходит игрок " + players[side].getName());
            answer = getAnswer();
            players[side].setMove(step - 1, answer);
            if (answer > question) {
                System.out.println("Введённое число больше задуманного.");
            } else if (answer < question) {
                System.out.println("Введённое число меньше задуманного.");
            } else {
                finish = true;
            }
            if (step >= MAX_STEP) {
                System.out.println("Ходы у игрока " + players[side].getName() + " закончились.");
                if (side == 1) {
                    finish = true;
                }
            }
            System.out.println("");
            if (side == 1) {
                step++;
            }
            side = 1 - side;
        } while (!finish);

        if (answer == question) {
            System.out.println("Число угадано, игра окончена!");
        } else {
            System.out.println("Игра окончена");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(players[i].getName() + " назвал числа: " + players[i].getMoves());
        }

    }

    private int getQuestion() {
        return (int)(Math.random() * 100);
    }

    private int getAnswer() {
        System.out.print("Введите число: ");
        return in.nextInt();
    }
}