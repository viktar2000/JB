package com.epam.jb.lesson0302;

public class ArrayNewArrayNullElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 0};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {

                b[j] = i;
                System.out.println(b[j]);
                j++;

            }

        }
    }

}
