package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Завдання 1:");
        Random xRandom = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int xNumber = xRandom.nextInt(100);
            if (xNumber % 2 == 0) {
                array[i] = xNumber;
                System.out.println(xNumber);
            } else {
                i--;
            }
        }

        System.out.println("Завдання 2:");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Завдання 3:");
        char[] symbolsArray = new char[10];
        Random random = new Random();
        for (int i = 0; i < symbolsArray.length; i++) {
            int symbol = random.nextInt(50);
            symbolsArray[i] = (char) symbol;
            System.out.print(symbolsArray[i]);
        }

        System.out.println("Завдання 4:");

        int maxValue = array[0];
        for (int a = 1; a < array.length; a++) {
            if (array[a] > maxValue) {
                maxValue = array[a];
            }
        }
        System.out.println("Найбільше число масиву " + maxValue);

        System.out.println("Завдання 5:");
        int minValue = array[0];
        for (int a = 1; a < array.length; a++) {
            if (array[a] < minValue) {
                minValue = array[a];
            }
        }
        System.out.println("Найбільше число масиву " + minValue);

        System.out.println("Завдання 6:");
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double middleValue = (double) sum / array.length;
        System.out.println("Середнє значення масиву = " + middleValue);

        System.out.println("Завдання 7:");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Найбільше парне значення в масиві: " + max);

        System.out.println("Завдання 8:");
        for (int k = 0; k < array.length; k++) {
            if (k % 2 == 0) {
                System.out.println("індекс " + k + " : число " + array[k]);
            }
        }
    }
}
