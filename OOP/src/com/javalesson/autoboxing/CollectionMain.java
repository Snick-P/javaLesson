package com.javalesson.autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Position 1");
        list.add("Position 2");
        list.add("Position 3");
        list.add("Position 4");
        list.add("Position 5");


        for (String value : list
        ) { int i = list.indexOf(value)+1;
            System.out.println("Value "+i+ " = " + value);
        }

        String[] colors = {"yellow", "green", "blue"};
        LinkedList<String> li = new LinkedList<>(Arrays.asList(colors));
       li.add("black");

       colors = li.toArray(new String[li.size()]);
        for (String i:colors){
            System.out.printf(i+"\n");
        }


    }
}
