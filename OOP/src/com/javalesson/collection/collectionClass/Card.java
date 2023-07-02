package com.javalesson.collection.collectionClass;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Card implements Comparable<Card> {

    public enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

    public enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    private final Suit suit;

    private final Face face;

    public Card(Suit siut, Face face) {
        this.suit = siut;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card card) {
//            Enum в массив
        Face[] values = Face.values();
//            Массив в лист
        List<Face> faces = Arrays.asList(values);
//            Сортировка по индексу листа

        if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
            return -1;
        } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
            return 1;
        } else if ((faces.indexOf(this.face) == faces.indexOf(card.getFace()))) {
            return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getSuit() == card.getSuit() && getFace() == card.getFace();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuit(), getFace());
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
