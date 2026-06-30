class Student1 {
    int id;
    String name;
}

public class TestStudent {
    public static void main (String[] args)
    {
        Student1 s1 = new Student1();  // Student1 Object
        s1.id = 17; // assigning value to reference variable id
        s1.name = "Bizesh"; // assigning value to reference variable name
        System.out.println("ID: "+s1.id);
        System.out.println("Name: "+s1.name);
    }
}
