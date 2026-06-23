class Employee{
    private int empId;
    private String department;

    public Employee(int empId, String department) {
        this.empId = empId;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;

        if (obj == null || getClass() != obj.getClass()) 
            return false;
        
        Employee emp = (Employee) obj;
        return empId == emp.empId && department.equals(emp.department);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(empId);
        result = 31 * result + department.hashCode();
        return result;
    }

}


public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "HR");
        Employee emp2 = new Employee(101, "HR");
        Employee emp3 = new Employee(102, "IT");

        System.out.println("e1 equals e2: " + emp1.equals(emp2)); // true
        System.out.println("e1 hash code: " + emp1.hashCode()); // returns a hash code based on empId and department
        System.out.println("e2 hash code: " + emp2.hashCode()); // returns the same hash code as emp1

        System.out.println();

        System.out.println("e1 equals e3: " + emp1.equals(emp3)); // false
        System.out.println("e1 hash code: " + emp1.hashCode()); // returns a hash code based on empId and department
        System.out.println("e3 hash code: " + emp3.hashCode()); // returns a different hash code based on empId and department

    }
}



