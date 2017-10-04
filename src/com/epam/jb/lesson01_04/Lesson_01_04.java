package com.epam.jb.lesson01_04;

import java.util.Scanner;

public class Lesson_01_04 {

        public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double sum;



        Scanner conin = new Scanner(System.in);


        System.out.println("ВВеди пжл а");
        while(!conin.hasNextDouble())
        {
            conin.next();
        }

        a = conin.nextDouble();

        System.out.println("ВВеди пжл b");
        while(!conin.hasNextDouble())
        {
            conin.next();
        }

        b = conin.nextDouble();

        System.out.println("ВВеди пжл c");
        while(!conin.hasNextDouble())
        {
            conin.next();
        }

        c = conin.nextDouble();

        System.out.println("ВВеди пжл d");
        while(!conin.hasNextDouble())
        {
            conin.next();
        }

        d = conin.nextDouble();

         sum = a+ b + c + d;
        System.out.println("Сумма четырех чисел" +  " " + sum);

        // TODO Auto-generated method stub

    }

    }

