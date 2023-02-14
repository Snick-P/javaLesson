package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passangersNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passangersNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passangersNumber = passangersNumber;
    }

    private void charge() {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }

    public void setPassangersNumber(int passangersNumber) {
        this.passangersNumber = passangersNumber;
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Car is starting");
    }

    @Override
    public void energize() {
        charge();
    }

    @Override
    public void stop() {

        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Car is stopped");
    }
}
