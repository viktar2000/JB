package com.epam.jb.lesson01_05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;


        Scanner conin = new Scanner(System.in);

        System.out.println("ВВеди пжл а");
        while (!conin.hasNextDouble()) {
            conin.next();
        }

        a = conin.nextDouble();

        System.out.println("ВВеди пжл b");
        while (!conin.hasNextDouble()) {
            conin.next();
        }

        b = conin.nextDouble();

        System.out.println("ВВеди пжл c");
        while (!conin.hasNextDouble()) {
            conin.next();
        }

        c = conin.nextDouble();

        d = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2) + Math.log(Math.pow(b, 2) + 1);

        System.out.println("А всё это равно" + d);
        // TODO Auto-generated method stub

    }

}
