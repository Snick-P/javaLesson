package com.javalesson.oop;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;
//    private String size;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

//    public String getSize() {
//        return size;
//    }

    public void setSize(Size size) {
        this.size = size;

    }

       /* if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else
            System.out.println("Size should be one of these: Bid, Average, Small");

    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof -Wof");
                break;
            case AVARAGE:
                System.out.println("Raf-Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf-Tiaf");
                break;

            default:
                System.out.println("Dog's size undefined");

        }


       /* if ("Big".equalsIgnoreCase(size)) {
            System.out.println("Wof -Wof");
        }
        if ("Average".equalsIgnoreCase(size)) {
            System.out.println("Raf-Raf");
        } else {
            System.out.println("Tiaf-Tiaf");
        }*/

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else System.out.println("Dogs are barking");
    }
}
