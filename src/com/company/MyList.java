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
            minValue = Math.min((Integer)arrayList.get(i), minValue);
        }
        return minValue;
    }

    public Number getMaxValue(){
        Integer maxValue = (Integer) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            maxValue = Math.max((Integer)arrayList.get(i), maxValue);
            }
        return maxValue;
    }
}
