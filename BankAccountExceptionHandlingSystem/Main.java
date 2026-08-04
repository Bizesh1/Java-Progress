package BankAccountExceptionHandlingSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Initial Balance: ");
            double initialBalance = sc.nextDouble();
            
            System.out.print("Is the account frozen? (true/false): ");
            boolean isFrozen = sc.nextBoolean();
            
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            
            System.out.print("\n\n");
            
            BankAccount account1 = new BankAccount("Bizesh", "100019090", initialBalance, isFrozen);
            
            try {
                account1.withdraw(withdrawAmount);
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Account Number: " + e.getAccountNumber());
                System.out.println("Attempted Amount: " + e.getAttemptedAmount());
            
            } catch (InvalidAmountException e) {
                System.out.println("Error: " + e.getMessage());
            
            } catch (AccountFrozenException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Account Number: " + e.getAccountNumber());
                System.out.println("Freeze Reason: " + e.getFreezeReason());
            }
        
            finally {
                System.out.println("\nType q to quit.\n");
                String input = sc.next();
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Exiting the program.\n");
                    break;
                } else {
                    System.out.println("Continuing the program.\n");
                 }
            }
        }
        sc.close();
    }
}

