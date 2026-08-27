package Array;

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class ArrayObject {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Bizesh", 123 );
        students[1] = new Student("Arin", 456 );
        students[2] = new Student("Bindu", 789 );

        for (int i=0; i<students.length; i++){
            students[i].display();
            System.out.println();
        }
    }
}
