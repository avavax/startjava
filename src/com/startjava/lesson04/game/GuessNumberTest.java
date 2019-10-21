package com.startjava.lesson04.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Scanner in = new Scanner(System.in);

        System.out.print("Имя первого игрока? ");
        playerOne.setName(in.nextLine());
        System.out.print("Имя второго игрока? ");
        playerTwo.setName(in.nextLine());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        String accept;

        do {
            guessNumber.run();
            do {
                System.out.print("Хотите сыграть ещё? [да/нет]: ");
                accept = in.nextLine();
            } while (!accept.equals("да") && !accept.equals("нет"));
        } while (accept.equals("да"));

    }
}