package com.epam.jb.lesson0304;

public class Lesson0304 {
    public static void main(String[] args) {
    int[] a = {0,1,22,3,5,11,13,17,19,21,23,26,28,31,2};
        checkArrayAndCreate(a);
    }
    public static void checkArrayAndCreate(int[] b){
        int count=0;
        for(int i=0;i<=b.length+count;i+=2){

                ++count;
        }
        int[] c = new int[count];
        int j=0;
        for(int i=0;i<c.length;i+=2 ){
            c[j]=b[i];
            System.out.print(c[j] + " ");
            j++;
        }
    }
}
