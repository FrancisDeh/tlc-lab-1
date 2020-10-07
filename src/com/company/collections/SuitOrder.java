package com.company.collections;

import java.util.Comparator;

public class SuitOrder implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return Character.toString(o1.getSuit()).compareTo(Character.toString(o2.getSuit()));
    }
    
}
