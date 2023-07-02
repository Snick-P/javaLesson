package com.javalesson.collection.stackQueue;

import com.javalesson.collection.collectionClass.Card;
import com.javalesson.collection.collectionClass.CardComparator;

import java.util.*;

public class QueueLauncher {
    public static void main(String[] args) {

        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator() {});

        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.offer(new Card(suit, face));
            }
        }

        Deque<Card> cards = new ArrayDeque<>();

        for (int i =0; i<20; i++){
            cards.offerLast(cardDeck.poll());
        }

        for (int i = 0; i<10; i++){
            System.out.println(cards.pollLast());
        }

     for(int i = 0; i<10; i++){
         System.out.println(cardDeck.poll());
        }
        System.out.println("Deck size is "+cardDeck.size());
        System.out.println(cardDeck.peek());

    }

}
