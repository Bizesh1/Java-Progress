package Exception_Handling;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException (String message) {
        super (message);
    }
}

public class CheckedCustomException {
    static void registerStudent (int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Student's age must be more than 18.");
        }
        System.out.println("Student Registered Succcessfully");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        try {
            registerStudent(age);
        } catch (InvalidAgeException e) {
            System.out.println("Checked Custom Exception: " + e.getMessage());
        }

        sc.close();
    }

}
