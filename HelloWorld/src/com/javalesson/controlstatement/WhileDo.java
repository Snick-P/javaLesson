package com.javalesson.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 100_000;
        double currentBalance = 0;
        int payment = 1_000;
        int years = 0;
        double interestRate = 0.1;

        do {
            {
                currentBalance += payment;
            }
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year = " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance && years < 15);


    }
}
