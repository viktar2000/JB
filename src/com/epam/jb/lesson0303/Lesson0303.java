package com.epam.jb.lesson0303;

public class Lesson0303 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4};
        boolean b = checkArray(a);
        System.out.printf("всё вот " + b);
    }
    public static boolean checkArray(int[] b) {
        boolean status = true;

        for (int i = 0; i < b.length; i++) {
            if (b[i] > b[i++]) {
                i++;
            } else {
                status = false;
            }
        }
        return status;
    }
}
