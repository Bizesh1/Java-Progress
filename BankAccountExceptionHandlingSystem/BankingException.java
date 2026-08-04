package BankAccountExceptionHandlingSystem;

public class BankingException extends Exception {
    private int errorCode;
    private String accountNumber;

    public BankingException(String message, int errorCode, String accountNumber) {
        super(message);
        this.errorCode = errorCode;
        this.accountNumber = accountNumber;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
