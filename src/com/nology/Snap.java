package com.nology;

import java.util.ArrayList;

public class Snap extends CardGame {
    Card prevCard;
    public Snap(String name) {
        super(name);
        prevCard = dealCard();
    }
/*
    public void play() {
        String result = "failure";
        Card prevCard = dealCard();  //Turn by system
        System.out.println("Please press enter key");
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();

        while(inputLine != null && result != "success") {
            shuffleDeck();
            Card currentCard  = dealCard();  // user turn
            System.out.println("Prev turn - " + prevCard.getSymbol() + " Current turn - " + currentCard.getSymbol());

            if (prevCard.getSymbol().equals(currentCard.getSymbol())) {
                System.out.println("You win");
                result = "success";
                break;
            } else {
                System.out.println("Keep trying!!");
                result ="failure";
            }
            prevCard = dealCard(); //system turn
            System.out.println("Please press enter key to continue...");
            Scanner nextInput = new Scanner(System.in);
            inputLine = nextInput.nextLine();
        }
    }
    */

public Card dealPlayerCard(Player player) {
    player.setPlayerTurn(true);
    shuffleDeck();
    Card card = dealCard();
    return card;
}

    public boolean play(Player player) {
        Card currentCard = dealCard();

        if (player.getInput() != null ) {
            currentCard = dealPlayerCard(player);
        }
        System.out.println("Prev card: " + prevCard.getSymbol() + " Current card: " + currentCard.getSymbol());

        if(currentCard.getSymbol().equals(prevCard.getSymbol())) {
            System.out.println("Player " + player.getName() + " wins");
            return true;
        } else {
            System.out.println("keep playing");
            prevCard = currentCard;
            return false;
        }
    }
}
