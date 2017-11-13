package com.epam.jb.lesson0202;


import java.util.Scanner;

import static java.lang.String.valueOf;

public class Lesson020203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NumOfMonth = " ";

        System.out.println("Введите число месяца");
        if (sc.hasNext()) {
            NumOfMonth = sc.nextLine();
        }
        switch (valueOf(NumOfMonth)) {
            case "1":
            case "2":
            case "3":

                System.out.println("Зима");
                break;
            case "4":
            case "5":
            case "6":
                System.out.println("Весна");
                break;
            case "7":
            case "8":
            case "9":
                System.out.println("Лето");
                break;
            case "10":
            case "11":
            case "12":
                System.out.println("Счас");
                break;
            default:
                System.out.println("Так не бывает");
                break;
        }
    }
}
