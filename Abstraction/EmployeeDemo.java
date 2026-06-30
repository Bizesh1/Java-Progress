abstract class Employeee {
    protected int empID;
    protected String name;
    protected double salary;

    Employeee (int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    abstract void displayDetails();
}

interface Bonus {
    void calculateBonus();
}

class Manager extends Employeee implements Bonus {
    Manager (int empID, String name, double salary) {
        super(empID, name, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }

    @Override
    public void calculateBonus () {
        double bonus = salary * 0.20; // 20% bonus
        System.out.println("Bonus (20%): Rs. " + bonus);
    }

}

public class EmployeeDemo {
    public static void main (String[] args) {
        Manager manager = new Manager(69, "Bizesh", 40000);

        manager.displayDetails();
        manager.calculateBonus();
    }
}
