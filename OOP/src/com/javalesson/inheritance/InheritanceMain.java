package com.javalesson.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

        Truck truck = new Truck("Volvo", "VL 300", truckEngine, 300, 500, 1000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.load();
        truck.unload();

        System.out.println("\n");
        ElectricCar car = new ElectricCar("Tesla", "Model S", 100500, 4 );
        car.start();
        car.stop();
        car.charge();
        System.out.println("\n");

        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);

        Bus bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        bus.fuelUp();
        bus.pickUpPassangers(5);
        bus.start();
        bus.releasePassangers();

        Engine engine = bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston>pistons = engine.getPistons();
        System.out.println(pistons);

    }
}