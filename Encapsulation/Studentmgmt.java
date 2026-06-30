class StudentRecord {
    private int studentId;
    private String studentName;
    private double gpa;

    StudentRecord(int id, String name, double gpa){
        this.studentId = id;
        this.studentName = name;
        this.gpa = gpa;
    }

    public void display(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student GPA: " + gpa);
    }
}

public class Studentmgmt{
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord(1, "Bizesh", 3.7);
        StudentRecord student2 = new StudentRecord(2, "Ojas", 3.9);

        student1.display();
        System.out.println("\n");
        student2.display();
    }
}
