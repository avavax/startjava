package com.startjava.lesson04.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] moves = new int[10];

    public void setNull() {
        Arrays.fill(moves, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMove(int position, int number) {
        this.moves[position] = number;
    }

    public String getMoves() {
        String result = "";
        for (int move : this.moves) {
            if (move != 0) {
                result += move + " ";
            }
        }
        return result;
    }
}