package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world");

        byte b = 10;
        short c = 200;
        int a = b + 25;
        long myLongValue = 123_456_789_876_543_211_2L;

        float myFloatVal = 23.56F;
        double myDoubleVal = 56.23D;


        double sum = a + b + c + myLongValue + myDoubleVal + myFloatVal;
        System.out.println("Sum = " + sum);

        float floatResult = myFloatVal / 2;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        double myDoubleResult = myNewDouble / 2;

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';

        char char5 = '\u00A9';

        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);
        System.out.println("SUM of Characters");
        System.out.println("chars:" + char1 + char2 + char3 + char4 + char5);

        System.out.println("myDoubleResult = " + myDoubleResult);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("myLongValue = " + myLongValue);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string " + "some other string";
        System.out.println(s);

        short someShort = b;
        int someInt = someShort;
        someShort = (short) someInt;

        double someDouble = myFloatVal;

        System.out.println("someDouble = " + someDouble);
        System.out.println("myFloutVal = " + myFloatVal);

        someInt = (int) myLongValue;
        System.out.println("someInt = " + someInt);

        double someIntToDouble = someInt;
        System.out.println("someIntToDouble = " + someIntToDouble);

        double someIntToLong = someInt;
        System.out.println("someIntToLong = " + someIntToLong);

        double someLongToDouble = myLongValue;

        System.out.println("someLongToDouble = " + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong = " + someDoubleToLong);


/*
        System.out.println("someShort = "+someShort);
        System.out.println("someInt = "+someInt);
*/


    }

}









