class Student101 {
    int id;
    String name;
    Student101 (int id, String name) {                          // Constructor
        System.out.println ("ID: "+id + " Name: "+name);

    }
    void pass() {} //place holder for future use

}

public class ObjectConstructor {
    public static void main (String[] args) {
        Student101 s1 = new Student101 (100, "Texas");    // Object initialization through constructor 
        s1.pass(); //place holder for future use
    }
}
