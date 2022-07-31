package com.company;

import java.util.ArrayList;

public class MyList<T extends Number>  {

    public ArrayList<T> arrayList = new ArrayList<T>();

    public void add(T t) {
        arrayList.add(t);
    }

    @Override
    public String toString() {
        Integer minValue = (Integer) arrayList.get(0);
        Integer maxValue = (Integer) arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            Integer value = (Integer)arrayList.get(i);
            minValue = Math.min(value, minValue);
            maxValue = Math.max(value, maxValue);
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return "Long way: Max value = " + maxValue + ", Min value = " + minValue;
    }
}
