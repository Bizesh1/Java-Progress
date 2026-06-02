class Student {
    String name;
    int id;

    Student(String name){
        System.out.println("Student Name: "+name);
    }

    Student(int id){
        System.out.println("Student id: "+id);
    }

    Student(String name, int id){
        System.out.println("Student Name: "+name);
        System.out.println("Student id: "+id);
    }
    
    void pass(){} // placeholder
}


public class ConstructorOverloading {
    public static void main (String[] args){
        Student s1 = new Student(123);
        Student s2 = new Student("123");
        Student s3 = new Student("Bizesh");
        Student s4 = new Student("Bizesh",123);
        s1.pass();
        s2.pass();
        s3.pass();
        s4.pass();  
    }
}