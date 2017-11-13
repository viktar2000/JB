package lesson0307;

public class MinArray {
    public static void minFind(double[] a) {
        double min = a[0];
        int minElIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                minElIndex = i;
            }
        }
        System.out.println(minElIndex + " " + min);
    }
}