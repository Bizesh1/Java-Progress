
// COPY CONSTRUCTOR

class Friend {
    String name;
    int age;

    Friend(String name, int age) {  // parameterized constructor 
        this.name = name;
        this.age = age;

        System.out.println(name + " called the parameterized Constructor.");
    }

    Friend(Friend other) {  // Copy Constructor
        this.name = other.name;
        this.age = other.age;

        System.out.println("Copy Constructor called for " + other.name);
    }   

    Friend() {  // Default Constructor
        System.out.println("Default Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void pass() {}
}

public class C_Constructor {
    public static void main(String[] args) {
        System.out.println("\n");
        Friend f1 = new Friend("Alice", 25);  // parameterized constructor called
        f1.display();
        System.out.println("\n");

        Friend f2 = new Friend(f1);  // Using Copy Constructor
        f2.display();
        System.out.println("\n");
        
        Friend f3 = new Friend();  // Default Constructor called
        f3.display();
        System.out.println("\n");
    }
}
