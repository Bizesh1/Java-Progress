class Student2 {
    int id;
    String name;

    void insertRecord(int i, String n) {
        this.id = i;
        this.name = n;
    }

    void display() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}

public class TestStudent2 {
    public static void main (String[] args)
    {
        Student2 s1 = new Student2();  
        s1.insertRecord(17, "Bizesh"); //object initialization through method
        s1.display();
    }
}
