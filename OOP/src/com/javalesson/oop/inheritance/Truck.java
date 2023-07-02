package com.javalesson.oop.inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;


    public Truck(String producer, String model, Engine engine, int availablePatrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePatrol, tankVolume);
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

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {

        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck is stopped");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()-getAvailablePatrol());
    }
}
