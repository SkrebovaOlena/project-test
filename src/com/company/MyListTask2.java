package com.company;

import java.util.*;

public class MyListTask2<T extends Comparable> {

    public List<T> myListTask2 = new ArrayList<T>();

    public void add(T t) {
        myListTask2.add(t);
    }

    public T getMaxValue() {
        T maxValue = myListTask2.get(0);
        for (int i = 0; i < myListTask2.size(); i++) {
            T value = myListTask2.get(i);
            if (maxValue.compareTo(value) < 1) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public T getMinValue() {
        T minValue = myListTask2.get(0);
        for (int i = 0; i < myListTask2.size(); i++) {
            T value = myListTask2.get(i);
            if (value.compareTo(minValue) < 1) {
                minValue = value;
            }
        }
        return minValue;
    }
}