package com.epam.jb.lesson01_07;

import java.util.Scanner;

public class IfElseThen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;

        if (!sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        a = sc.nextDouble();
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        if (a > b) {
            c = sc.nextDouble();

            System.out.println("Sum is " + (b + c));
        } else if (a < b) {
            c = sc.nextDouble();

            System.out.println("Sum is " + (a + b + c) + "Новый год");
        }
    }
}
