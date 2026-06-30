class Model {
    int modelNumber;
    String modelName;
    Model(){

    } //default constructor

    Model(int num, String name){         // parameterized constructor
        System.out.println("Model Number: "+num+ " Name: "+name);
    }

    void insertRecord(int num, String name) {        // method to initialize object
        this.modelNumber = num;
        this.modelName = name;
    }

    void display(){
        System.out.println("Car Model Number: "+ modelNumber);
        System.out.println("Car Model Name: "+ modelName);
    }

    void pass(){}
}


public class Car {
    public static void main(String[] args) {
        Model m1 = new Model();

        m1.modelNumber = 2007; //object initialization through instance variable
        m1.modelName = "Mustang";
        m1.display();

        Model m2 = new Model();
        m1.insertRecord(2001, "Corvette"); //object initialization through method
        m1.display();
        m2.pass(); //place holder for future use

        Model m3 = new Model(1969, "Beatle"); //object initialization through constructor
        m3.pass(); //place holder for future use

    }
}
