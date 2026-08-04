package BankAccountExceptionHandlingSystem;

public class InvalidAmountException extends RuntimeException {
    
    public InvalidAmountException(String message) {
        super(message);
    }

    public static void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount: " + amount + ". Amount must be greater than zero.");
        }
    }

}
