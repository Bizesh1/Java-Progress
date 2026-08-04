package BankAccountExceptionHandlingSystem;

public class InsufficientBalanceException extends BankingException {

    private double currentBalance;
    private double attemptedAmount;

    public InsufficientBalanceException(String message, 
        int errorCode, 
        String accountNumber, 
        double currentBalance, 
        double attemptedAmount) 
    {
        super(message, errorCode, accountNumber);
        this.currentBalance = currentBalance;
        this.attemptedAmount = attemptedAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getAttemptedAmount() {
        return attemptedAmount;
    }

    public static void validateInsufficientBalance(String accountNumber, double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException ("Insufficient Balance.", 101 ,accountNumber, balance, amount);
        }
    }
}

