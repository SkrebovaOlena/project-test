package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Завдання 1:");
        Random x_random = new Random();
        int[] array = new int[10];
        for (int i=0; i < array.length; i++) {
            int r = x_random.nextInt(100);
              if (r%2 == 0) {
                  array[i] = r;
                  System.out.println(r);
              }
              else{
                  i--;
              }
        }

        System.out.println("Завдання 2:");
        for (int i=10; i>=0; i--) {
            System.out.println(i);
        }

        System.out.println("Завдання 3:");
        char[] y = new char[10];
        Random random = new Random();
        for (int i=0; i<y.length; i++) {
            int a = random.nextInt(50);
          y[i] = (char) a;
         System.out.print(y[i]);
        }

        System.out.println("Завдання 4:");

        int max_value = array[1];
        for (int a = 1; a < array.length; a++) {
           if (array[a] > max_value) {
               max_value = array[a];
           }
        }
        System.out.println("Найбільше число масиву " + max_value);

        System.out.println("Завдання 5:");
        int min_value = array[0];
        for (int a = 1; a < array.length; a++) {
          if (array[a] < min_value) {
              min_value = array[a];
          }
        }
        System.out.println("Найбільше число масиву " + min_value);

        System.out.println("Завдання 6:");
        int q = 0;
        for (int i: array
             ) {
            q = q + i;
        }
        double mid = (double) q / array.length;
        System.out.println("Середнє значення масиву = " + mid);

        System.out.println("Завдання 7:");
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < array.length; a++) {
            if (array[a]%2 == 0 && array[a]>max)  {
                max = array[a];
            }
        }
        System.out.println("Найбільше парне значення в масиві: " + max);

        System.out.println("Завдання 8:");
        for (int a = 0; a < array.length; a++) {
            if (a%2 == 0) {
                System.out.println("індекс " + a + " : число " + array[a]);
            }
        }
    }
}
