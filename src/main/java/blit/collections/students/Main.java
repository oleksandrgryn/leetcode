package blit.collections.students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Gryn", 36,"+18509606700"));
        students.add(new Student("Test", "lastTest", 22,"+12309605171"));

        for(Student student:students){
            System.out.println(student);
        }
    }
}
