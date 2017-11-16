package lesson_2_03_02;

public class Runner {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0]=new Student(new int[]{1,2,3});
        students[1]=new Student(new int[]{1,2,3});
        students[2]=new Student(new int[]{2,3,4});


        Group N1 = new Group(students);
        System.out.println(N1.avgGroup());





    }
}
