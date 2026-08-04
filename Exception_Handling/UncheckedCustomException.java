package Exception_Handling;
import java.util.Scanner;

class InvalidAmountException extends RuntimeException {
    InvalidAmountException (String message) {
        super(message);
    }
}


public class UncheckedCustomException {
    static void withdraw (double amount) {
        if (amount < 0) {
            throw new InvalidAmountException ("Amount cannot be Negative.");
        }
        System.out.println("Withdraw Amount: " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdraw amt: ");
        int amt = sc.nextInt();

        try {
            withdraw(amt);
        } catch (InvalidAmountException e) {
            System.out.println("Checked Custom Exception: " + e.getMessage());
        }

        sc.close();
    }
}
