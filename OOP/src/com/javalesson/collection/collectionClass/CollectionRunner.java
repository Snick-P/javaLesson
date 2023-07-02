package com.javalesson.collection.collectionClass;

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

}
