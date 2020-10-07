package com.company.collections;

public class Card implements Comparable<Card> {
    private char suit;
    private char value;

    public Card(char suit, char value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + suit;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Card other = (Card) obj;
        if (value != other.value)
            return false;
        return true;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public int compareTo(Card o) {
        // return Character.toString(this.suit).compareTo(Character.toString(o.suit));
        return Character.toString(this.value).compareTo(Character.toString(o.value));
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", value=" + value + "]";
    }



}
