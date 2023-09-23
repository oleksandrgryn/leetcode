package blit.assessments.week2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public int id;
    public String name;
    public int percentage;

    public static void main(String[] args) throws StuException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aaron", 75));
        students.add(new Student(102, "Yomi", 80));
        students.add(new Student(103, "Abdullah", 68));
        try {
            students.add(new Student(104, "Sid", 35));
        }
        catch (StuException e){
            System.out.println(e);
        }
        students.add(new Student(105, "Vidya", 89));
        System.out.println(students.toString());
    }

    public Student(int id, String name, int percentage) throws StuException {
        this.id = id;
        this.name = name;
        if (percentage < 40) {
            throw new StuException();
        }
        this.percentage = percentage;
    }

    public String toString() {
        return "[Student's id: " + id + ", names is " + name + ", percentage is: " + percentage + "]";
    }
}
