package com.startjava.lesson02.game;

import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int question;
    private int answer;
    private Scanner in;
    private String gameSide;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.gameSide = "One";
        this.in = new Scanner(System.in);
    }

    public void run() {
        question = getQuestion();

        currentPlayer = playerOne;
        System.out.println("Ходит игрок " + currentPlayer.getName());
        answer = getAnswer();

        while (answer != question) {
            if (answer > question) {
                System.out.println("Введённое число больше задуманного.");
            } else if (answer < question) {
                System.out.println("Введённое число меньше задуманного.");
            }
            if (currentPlayer == playerOne) {
                currentPlayer = playerTwo;
            } else {
                currentPlayer = playerOne;
            }
            System.out.println("");
            System.out.println("Ход переходит к игроку " + currentPlayer.getName());
            answer = getAnswer();
        }

        System.out.println("Число угадано, игра окончена!");
        System.out.println("Победил игрок " + currentPlayer.getName());
    }

    private int getQuestion() {
        return (int)(Math.random() * 100);
    }

    private int getAnswer() {
        System.out.print("Введите число: ");
        return in.nextInt();
    }
}