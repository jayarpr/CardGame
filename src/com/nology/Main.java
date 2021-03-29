package com.nology;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CardGame cardGame = new CardGame("New Card Game");
//        cardGame.getDeck();
//        cardGame.sortDeckInNumberOrder();
//        System.out.println("-----------------------------");
//        cardGame.getDeck();
//        cardGame.sortDeckInSuitOrder();
//        System.out.println("-----------------------------");
//        cardGame.getDeck();
//        cardGame.shuffleDeck();
//        System.out.println("-----------------------------");
//        cardGame.getDeck();
//        System.out.println(cardGame.dealCard());

//        Snap newSnap = new Snap("Snap game");
//        newSnap.play();

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        boolean gameEnded = false;
        int counter = (int) (Math.random() * 2);

        Snap newSnap = new Snap("Snap game");

        while (!gameEnded) {
            if(counter == 0) {
                gameEnded = newSnap.play(player1);
                counter++;
            } else if (counter == 1) {
                gameEnded = newSnap.play(player2);
                counter--;
            }
        }
    }
}
