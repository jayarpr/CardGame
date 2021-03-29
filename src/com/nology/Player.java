package com.nology;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;
    private boolean hasWon = false;
    private boolean isPlayerTurn = false;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        isPlayerTurn = playerTurn;
    }


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInput() {
        System.out.println("Press Enter key " + getName() + ":");
        Scanner nextInput = new Scanner(System.in);
        return nextInput.nextLine();
    }
}
