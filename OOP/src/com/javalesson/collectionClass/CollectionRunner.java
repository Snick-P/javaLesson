package com.javalesson.collectionClass;

import javax.swing.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.*;

public class CollectionRunner {

    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

//        System.out.println("Original deck of cards");
//        printOutput(deckOfCards);


        Collections.shuffle(deckOfCards);

        Collections.sort(deckOfCards);
        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i>=0){
            System.out.printf("Card was found at position "+i);
        } else System.out.printf("Card was not found");


        System.out.println("\n\nCards after shuffle");
//        printOutput(deckOfCards);


//        Collections.sort(deckOfCards);
//        Второй метод сортировки, при котором мы передаем компаратор
        Collections.sort(deckOfCards, new CardComparator());

        System.out.println("\n\nCards after sorting");
//        printOutput(deckOfCards);
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

    public static class Card implements Comparable<Card> {

        private enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

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
            } else  if ((faces.indexOf(this.face) == faces.indexOf(card.getFace()))) {
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

    public static class CardComparator implements Comparator<Card> {

        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card card1, Card card2) {
           if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
                return -1;
            } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
                return 1;
            } else  if ((faces.indexOf(card1.getFace())) == faces.indexOf(card2.getFace())) {
               return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
           } else
            return 0;
        }
    }

}
