package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passangersNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passangersNumber) {
        super(producer, model, EngineType.ELICTRIC);
        this.batteryVolume = batteryVolume;
        this.passangersNumber = passangersNumber;
    }

    public void charge() {
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
}
