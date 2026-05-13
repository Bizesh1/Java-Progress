public class Student {
    int id;
    String Name;

    public static void main(String[] args) {
        Student std = new Student(); // creating object of Student class
        std.id = 100;   // assigning value to reference variable id
        std.Name = "Bizesh";  // assigning value to reference variable Name
        System.out.println(std.id+" "+std.Name);    // printing value of id and Name variables
    }

}
