class Parameterized {
    int id;
    String name;

    Parameterized (int id, String name) {                          // Parameterized Constructor
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println ("ID: "+id + " Name: "+name);
    }

}

public class Pconstructor {
    public static void main (String[] args) {
        // Object initialization through parameterized constructor 
        Parameterized p1 = new Parameterized (100, "Bijesh"); 
        p1.display();
    }
}
