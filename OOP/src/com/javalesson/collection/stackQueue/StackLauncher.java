package com.javalesson.collection.stackQueue;

import java.util.Stack;

public class StackLauncher {

    public static void main(String[] args) {


        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.printf("Last enter passenger " + bus.peek());
        while (!bus.empty()) {
            System.out.println(" " + bus.pop());
        }
    }


    private static class Passenger {

        private String name;
        private String surname;

        public Passenger(String name, String surname) {

            this.name = name;
            this.surname = surname;
        }


        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + " is " + name + " " + surname;
        }
    }
}
