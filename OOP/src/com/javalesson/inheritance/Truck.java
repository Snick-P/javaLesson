package com.javalesson.inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;


    public Truck(String producer, String model, EngineType engineType, int availablePatrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, availablePatrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing truck");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load(){
        System.out.println("Cargo loaded");
    }
    public void unload(){
        System.out.println("Cargo unloaded");
    }

}
