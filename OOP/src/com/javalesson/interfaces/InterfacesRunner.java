package com.javalesson.interfaces;

public class InterfacesRunner {
    public static void main (String [] args){
        Priceble pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Priceble phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Priceble fridge = new Fridge("LG","E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Priceble del){
        System.out.println("Delivery price "+del.calcDeliveryPrice());
        System.out.println("Order price "+del.calcOrderPrice());
    }
}
