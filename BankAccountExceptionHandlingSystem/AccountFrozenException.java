package BankAccountExceptionHandlingSystem;

public class AccountFrozenException extends BankingException {

    private String freezeReason;

    public AccountFrozenException(String message, int errorCode, String accountNumber, String freezeReason) {
        super(message, errorCode, accountNumber);
        this.freezeReason = freezeReason;
    }

    public String getFreezeReason() {
        return freezeReason;
    }

    public static void checkAccountStatus(boolean frozen, String accountNumber) throws AccountFrozenException {
        if (frozen) {
            throw new AccountFrozenException("Account is frozen.", 102, accountNumber, "Suspicious activity");
        }
    }
}