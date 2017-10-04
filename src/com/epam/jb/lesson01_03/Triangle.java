package com.epam.jb.lesson01_03;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double square;

        Scanner conin = new Scanner(System.in);
        System.out.println("ВВеди a");
        while(!conin.hasNextDouble()){
            conin.next();// TODO Auto-generated method stub
        }

        a = conin.nextDouble();

        System.out.println("ВВеди b");
        while(!conin.hasNextDouble()){
            conin.next();// TODO Auto-generated method stub
        }

        b = conin.nextDouble();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Гиппотенуза - " + c);

        square = 0.5*(a*b);
        System.out.println(square + " а это площадь");




    }
}
