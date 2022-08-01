package com.company;

import java.util.ArrayList;

public class MyList<T extends Number>  {

    public ArrayList<T> arrayList = new ArrayList<T>();

    public void add(T t) {
        arrayList.add(t);
    }

    public Number getMinValue(){
        Integer minValue = (Integer) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            Integer value = (Integer)arrayList.get(i);
            minValue = Math.min(value, minValue);
        }
        return minValue;
    }

    public Number getMaxValue(){
        Integer maxValue = (Integer) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            Integer value = (Integer)arrayList.get(i);
            maxValue = Math.max(value, maxValue);
            }
        return maxValue;
    }

    @Override
    public String toString() {
        return "Long way: Max value = " + getMaxValue() + ", Min value = " + getMinValue();
    }
}
