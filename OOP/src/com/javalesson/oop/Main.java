package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {


        System.out.println(Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize("Average");
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize("big");
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize("Big");
        doberman.bite();



    }
}
