package com.javalesson.interfaces;

public interface Priceble extends Deliverable, Orderable{

    default int calcPrice() {
        return calcOrderPrice()+calcOrderPrice();
    }

}
