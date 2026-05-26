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
        StudentRecord student1 = new StudentRecord(1, "Arin", 3.8);
        StudentRecord student2 = new StudentRecord(2, "Swors", 4.0);

        student1.display();
        student2.display();
    }
}
