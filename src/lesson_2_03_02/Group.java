package lesson_2_03_02;

public class Group {

    Student[] students;

    public Group(Student[] students) {
        this.students = students;
    }
   int sum;
    double avg;
    public double avgGroup() {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].getMarks().length; j++) {
                sum +=students[i].marks[j];
                avg = sum/students.length;
            }
        }
       return avg;
    }
}
