package com.nology;

public class Card {
    private String suit;
    private String symbol;
    private int symbolValue ;

    public Card(String suit, String symbol, int symbolValue) {
        this.suit = suit;
        this.symbol = symbol;
        this.symbolValue = symbolValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getSymbolValue() {
        return symbolValue;
    }

    public void setSymbolValue(int symbolValue) {
        this.symbolValue = symbolValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", symbolValue=" + symbolValue +
                '}';
    }
}
