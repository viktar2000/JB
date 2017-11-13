package lesson0307;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        double max = 0;
        N = sc.nextInt();
        double[] a = new double[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        for (double d : a) {
            System.out.printf("%.3f ", d);
        }
        max = a[0];
        for (double anA : a) {

            if (max < anA) {
                max = anA;
            }
        }
        System.out.println("\n" + max);
        MinArray.minFind(a);
    }
}
