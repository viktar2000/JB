package com.epam.jb.lesson1_2;

import java.util.Scanner;

public class Lesson02_03 {
    public static void main(String[] args) {
        int Number = 0;
        int counter = 0;
        double[] b;

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            Number = sc.nextInt();
        }

        b = new double[Number];


        for (int i = 0; i < b.length; i++) {

            if (sc.hasNextDouble()) {

                b[i] = sc.nextDouble();
                double current = Math.floor(b[i]);
                if ((current % 2 == 0) && (current > 15)) {
                    counter++;
                }

            }

        }
        System.out.println(counter);
    }
}


