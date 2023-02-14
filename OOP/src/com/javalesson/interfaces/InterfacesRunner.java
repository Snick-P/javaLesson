package com.javalesson.interfaces;

public class InterfacesRunner {
    public static void main (String [] args){
        Deliverable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Deliverable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Deliverable frige = new Frige("LG","E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(frige);
    }

    private static void printDeliveryPrice(Deliverable del){
        System.out.println("Delivery price "+del.calcDeliveryPrice());
    }
}
