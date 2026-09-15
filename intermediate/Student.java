/**
 * 13 - Student
 * Models a student with fields, constructor, getters, and behavior.
 * Demo: creates students, prints details, compares marks.
 *
 * Concepts: classes, objects, constructors, this, encapsulation, toString.
 *
 * Run:
 *   javac Student.java
 *   java Student
 *
 * Sample output:
 *   Student{id=101, name='Asha', marks=92.5, grade='A'}
 *   Topper: Asha
 */
public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId()       { return id; }
    public String getName()  { return name; }
    public double getMarks() { return marks; }

    public char grade() {
        if (marks >= 90) return 'A';
        if (marks >= 75) return 'B';
        if (marks >= 60) return 'C';
        if (marks >= 40) return 'D';
        return 'F';
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name
                + "', marks=" + marks + ", grade='" + grade() + "'}";
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Asha", 92.5);
        Student s2 = new Student(102, "Ravi", 78.0);
        Student s3 = new Student(103, "Meena", 85.5);

        Student[] batch = {s1, s2, s3};
        Student topper = batch[0];
        for (Student s : batch) {
            System.out.println(s);
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        System.out.println("Topper: " + topper.getName());
    }
}
