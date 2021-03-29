package com.nology;

import java.util.Comparator;

public class CardDeckNumberSorter implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getSymbolValue(), o2.getSymbolValue()) ;
    }
}
