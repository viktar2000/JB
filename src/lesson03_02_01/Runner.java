package lesson03_02_01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int number=2;
        Fraction[] array= new Fraction[number];
        inputF(array);
        showFraction(array);
    }

    public static void inputF(Fraction[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            Fraction frac = new Fraction();
            frac.setM(sc.nextInt());
            frac.setN(sc.nextInt());

            array[i] = frac;

        }
    }
    public static void showFraction(Fraction[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getM() + "/" + array[i].getN() + " ");
        }
    }


}
