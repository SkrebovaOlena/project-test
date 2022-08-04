package com.company;

public class MyListTask3 <T extends Comparable<T>> {

    public T[] myListTask3;

    public MyListTask3(T[] array) {
        myListTask3=array;
    }

    public T getMaxValue() {
        T maxValue = myListTask3[0];
        for (int i = 0; i < myListTask3.length; i++) {
            T value = myListTask3[i];
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public T getMinValue() {
        T minValue = myListTask3[0];
        for (int i = 0; i < myListTask3.length; i++) {
            T value = myListTask3[i];
            if (value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }
}
