package com.javalesson.methods;

public class Methods {

    public static void main(String[] args) {
        printMassage("Alex");
        System.out.println("Rectangle squere = " + calcRectangleSquere(5, 10));
        System.out.println("Square = " + calcSquare(5));
        System.out.println("Sum of squares" + (calcSquare(5) + calcRectangleSquere(5, 10)));

        String str1 = "I like black coffee";
        String str3 = "i like coffee!!!";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");

        String substring = str3.substring(0, 13);
        System.out.println("Substring = " + str3.substring(0, 13));
//        boolean b = substring.equals(str2);
//        System.out.println(b);

        boolean like = str1.endsWith("coffee");
        System.out.println(like);

        System.out.println(str1.replace("black", "white" ));

        System.out.println(str3.indexOf("!!!"));
    }


    static void printMassage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calcRectangleSquere(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }


}
