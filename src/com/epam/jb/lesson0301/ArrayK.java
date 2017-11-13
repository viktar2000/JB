package com.epam.jb.lesson0301;

import java.util.Scanner;

public class ArrayK {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        int Sum = 0;
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        for (int i = 0; i < b.length; i++) {
            if (b[i] % K == 0) {

                Sum += b[i];
            }

        }
        System.out.println(Sum);

    }
}
