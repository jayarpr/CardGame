package com.nology;

import java.util.*;

public class CardGame {
    private String name;
    private ArrayList<Card> deckOfCards;

    final String[] cardSuite = {"\u2660",	"\u2665",	"\u2666",	"\u2663"};
    HashMap<String, Integer> cardSymbolValues = new HashMap<String, Integer>();

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = initializeCards();
    }

    private ArrayList<Card> initializeCards() {
        ArrayList<Card> tempCardList = new ArrayList<Card>(52);
        getCardSymbolValues();

        for (Map.Entry keyValues : cardSymbolValues.entrySet()) {
            for(int i=0; i < cardSuite.length; i++) {
                Card card = new Card(cardSuite[i], keyValues.getKey().toString(), Integer.valueOf((int)keyValues.getValue()));
                tempCardList.add(card);
            }
        }
        return tempCardList;
    }

    private void getCardSymbolValues() {
        int[] numbers = {2,3,4,5,6,7,8,9,10};
        String[] characters  ={"J", "Q", "K", "A"};
        int characterValue = numbers.length + 2;

        for (int item:  numbers)
            cardSymbolValues.put(String.valueOf(item), item);

        for (String item:  characters) {
            cardSymbolValues.put(String.valueOf(item), characterValue);
            characterValue++;
        }
    }

    public void getDeck() {
       deckOfCards.forEach(card -> System.out.println(card));
    }

    public void sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparing(Card::getSymbolValue));
    }

    public void sortDeckInSuitOrder() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards, new Random());
    }

    public Card dealCard() {
        return deckOfCards.stream().findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "CardGame{" +
                "name='" + name + '\'' +
                ", deckOfCards=" +  deckOfCards;
    }
}
