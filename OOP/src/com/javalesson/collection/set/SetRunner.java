package com.javalesson.collection.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "A3", 60));
        sixCars.add(new Car("VW", "Polo", 25));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Clio", 30));
        europaCars.add(new Car("Reno", "Megan", 50));
        europaCars.add(new Car("VW", "Golf", 45));
        europaCars.add(new Car("VW", "Polo", 35));

        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);

        SortedSet<Car> cars = uniqueCars.subSet(new Car("Toyota", "Auris", 40), true,new Car("Audi", "A3", 60), true);

        print(uniqueCars);

//       Элемент идущий перед переданного
        System.out.println("Higher");
        Car higher = uniqueCars.higher(new Car("Toyota", "Auris", 40));
        System.out.println(higher);
//        Элемент идущий после переданного
        System.out.println("Lower");
        Car lower = uniqueCars.lower(new Car("Toyota", "Auris", 40));
        System.out.println(lower);
//      Элемент равный переданному или следующий после него
        System.out.println("Ceiling");
        Car ceiling = uniqueCars.ceiling(new Car("Toyota", "Auris", 43));
        System.out.println(ceiling);
//      Элемент равный переданному или следующий перед ним
        System.out.println("Floor");
        Car floor = uniqueCars.floor(new Car("Toyota", "Auris", 39));
        System.out.println(floor);



//        Разность множеств
//        sixCars.removeAll(europaCars);
//        print(sixCars);

//        Пересечение множеств
//        sixCars.retainAll(europaCars);
//        print(sixCars);

//        Симметрическая разность (уникальные результаты)
//        uniqueCars.removeAll(sixCars);
//        print(uniqueCars);
    }

    private static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());

        }
    }


}
