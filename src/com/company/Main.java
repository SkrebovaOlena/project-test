package com.company;

import java.util.Random;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        MyList<Integer> myList = new MyList<Integer>();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            myList.add(number);
            System.out.println(number);
        }

        // short variant
        System.out.println("Max value (short way) = " + Collections.max(myList.arrayList));
        System.out.println("Min value (short way) = " + Collections.min(myList.arrayList));

        // long variant
        System.out.println("Long way: Max value = " + myList.getMaxValue() + ", Min value = " + myList.getMinValue());

        // task 2
        MyListTask2<Integer> myListInteger = new MyListTask2<>();
        myListInteger.add(100);
        myListInteger.add(2000);
        myListInteger.add(55);
        MyListTask2<String> myListString = new MyListTask2<String>();
        myListString.add("Hello!!!");
        myListString.add("Good evening");

        System.out.println("Max value is: " + myListInteger.getMaxValue());
        System.out.println("Min value is: " + myListInteger.getMinValue());
        System.out.println("Max value is: " + myListString.getMaxValue());
        System.out.println("Min value is: " + myListString.getMinValue());

        // task 3
        String[] array = {"flowers", "animals", "trees"};
        MyListTask3 myListTask3 = new MyListTask3(array);
        System.out.println(myListTask3.getMaxValue());
        System.out.println(myListTask3.getMinValue());
    }
}
