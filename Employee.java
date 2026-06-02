
class Person {
    String name;

    Person() {
        System.out.println("Default Constructor Called");
    }

    Person (String name) {
        System.out.println("Name: "+name);
    }
}


public class Employee extends Person{
    Employee(){
        super(); // Parent class COnsteuctor
        System.out.println("Child Constructor Called");
    }

    Employee(String name) {
        super(name);
    }

    void pass(){} // placeholder

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("College");
        e1.pass();
        e2.pass();
    }
}
