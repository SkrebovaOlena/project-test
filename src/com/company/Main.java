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
    }
}
