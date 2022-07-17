package com.company;

import java.sql.SQLOutput;
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

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 2:");
        for (int i=10; i>=0; i--) {
            System.out.println(i);
        }
        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 3:");
        char[] y = new char[10];
        Random random = new Random();
        for (int i=0; i<y.length; i++) {
            int a = random.nextInt(50);
          y[i] = (char) a;
         System.out.print(y[i]);
        }

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 4:");
        Random random_c = new Random();
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = random_c.nextInt(100);
        }

        int first = c[1];
        for (int a = 1; a < c.length; a++) {
           if (c[a] > first) {
               first = c[a];
           }
            System.out.println(c[a]);
        }
        System.out.println("Найбільше число масиву " + first);

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 5:");
        Random random_d = new Random();
        int[] cd = new int[10];
        for (int i = 0; i < c.length; i++) {
            cd[i] = random_d.nextInt(100);
        }

        int small = cd[0];
        for (int a = 1; a < cd.length; a++) {
          if (cd[a] < small) {
                small = cd[a];
          }
            System.out.println(cd[a]);
        }
        System.out.println("Найбільше число масиву " + small);

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 6:");
        Random random_qw = new Random();
        int[] qw = new int[10];
        for (int i = 0; i < qw.length; i++) {
            qw[i] = random_qw.nextInt(100);
        }

        int q = 0;
        for (int i: qw
             ) {
            q = q + i;
            System.out.println(i);
        }
        double mid = (double) q / qw.length;
        System.out.println("Середнє значення масиву = " + mid);

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 7:");
        Random random_cm = new Random();
        int[] cm = new int[10];
        for (int i = 0; i < cm.length; i++) {
            cm[i] = random_cm.nextInt(100);
        }

        int max = 0;
        for (int a = 0; a < c.length; a++) {
            if (c[a] > max && c[a]%2 == 0) {
                max = c[a];
            }
            System.out.println(c[a]);
        }
        System.out.println("Найбільше парне значення в масиві: " + max);

        ////////////////////////////////////////////////////////////////
        System.out.println("Завдання 8:");
        Random random_sss = new Random();
        int[] sss = new int[10];
        for (int i = 0; i < sss.length; i++) {
            sss[i] = random_sss.nextInt(100);
        }

        for (int a = 0; a < sss.length; a++) {
            if (sss[a]%2 == 0) {
                System.out.println("число " + sss[a]);
                System.out.println("індекс " + a);
            }
        }
    }
}
