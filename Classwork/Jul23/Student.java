package Classwork.Jul23;

// 1. Create a Student class with id, name, marks
//     Create multiple student objects and display their details


public class Student {
    private String name;
    private int id;
    private double marks;

    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Bizesh", 101, 85.5);
        Student student2 = new Student("Arin", 102, 92.0);
        Student student3 = new Student("Binayak", 103, 78.5);

        System.out.println("Student 1 Details:");
        student1.displayInfo();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayInfo();
        System.out.println();

        System.out.println("Student 3 Details:");
        student3.displayInfo();
    }}