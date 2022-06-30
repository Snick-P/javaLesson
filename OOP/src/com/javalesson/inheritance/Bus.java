package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passangersNumber;

    public Bus(String producer, String model, Engine engine, int availablePatrol, int tankVolume, int passangersNumber) {
        super(producer, model, engine, availablePatrol, tankVolume);
        this.passangersNumber = passangersNumber;
        System.out.println("Bus was initialize");
    }

    public void fuelUp(){
        int volume = getTankVolume()-getAvailablePatrol();
        fuelUp(volume);
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {

        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus is stopped");
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

