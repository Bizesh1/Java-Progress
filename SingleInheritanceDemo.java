class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo){
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent(){
        displayPerson();
        System.out.println("Roll no: " + rollNo);
    }

}



public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Bizesh", 19, 10);
        System.out.println("----Student Details----");
        s1.displayStudent();
    }
}
