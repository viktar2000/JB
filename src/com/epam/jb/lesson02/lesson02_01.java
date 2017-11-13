package com.epam.jb.lesson02;

import java.util.Scanner;

public class lesson02_01 {
    public static void main(String[] args) {
        int x;
        int y;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый операнд");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        x = sc.nextInt();

        System.out.println("Введите второй операнд");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        y = sc.nextInt();
        System.out.println("Summ is " + " " + Sum.sumF(x, y));
        System.out.println("Product of numbers is " + " " + Pon.mul(x, y));

    }
}
