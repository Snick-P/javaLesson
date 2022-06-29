package com.javalesson.inheritance;

public class FuelAuto extends Auto {

    private int availablePatrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, EngineType engineType, int availablePatrol, int tankVolume) {
        super(producer, model, engineType);
        this.availablePatrol = availablePatrol;
        this.tankVolume = tankVolume;
    }

    void fuelUp(int patrolVolume){
        availablePatrol+=patrolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvailablePatrol() {
        return availablePatrol;
    }

    public void setAvailablePatrol(int availablePatrol) {
        this.availablePatrol = availablePatrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}