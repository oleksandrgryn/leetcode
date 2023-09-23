package blit.collections.students;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public Student(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Student's last name is %s, age = %s", firstName, age);
    }

}
