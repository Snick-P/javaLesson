package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passangersNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePatrol, int tankVolume, int passangersNumber) {
        super(producer, model, engineType, availablePatrol, tankVolume);
        this.passangersNumber = passangersNumber;
        System.out.println("Bus was initialize");
    }

    public void fuelUp(){
        int volume = getTankVolume()-getAvailablePatrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int patrolVolume) {
        int volume = getAvailablePatrol() + patrolVolume;
        if(volume>getTankVolume()){
            setAvailablePatrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }

    public void setPassangersNumber(int passangersNumber) {
        this.passangersNumber = passangersNumber;
    }

    public void pickUpPassangers(int passangersNum){
        this.passangersNumber += passangersNum;
        System.out.println("Picking up"+passangersNum+" passangers");
    }
    public void releasePassangers(){
        if(isRunning()){
            stop();
        }
        passangersNumber = 0;
        this.passangersNumber = passangersNumber;
        System.out.println("Passangers released");
    }
}

