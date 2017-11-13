package com.epam.jb.lesson020203;

import java.util.Scanner;

public class EqualsTwoStrings {
    public static void main(String[] args) {


        System.out.println("Введите две строки");

        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();

        if (one.equals(two)) {
            System.out.printf("Tdd");
        }

        if (one == two) {
            System.out.printf("Tdd1");
        }
    }
}
