package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

    public List<T> arrayList = new ArrayList<T>();

    public void add(T t) {
        arrayList.add(t);
    }

    public T getMinValue() {
        T minValue = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            T value = arrayList.get(i);
            if (value.doubleValue() < minValue.doubleValue())
                minValue = value;
        }
        return minValue;
    }

    public T getMaxValue() {
        T maxValue = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            T value = arrayList.get(i);
            if (value.doubleValue() > maxValue.doubleValue())
                maxValue = value;
        }
        return maxValue;
    }
}
