package BankAccountExceptionHandlingSystem;

public class BankAccount {
    private double balance;
    private String AccHolderName;
    private String AccNumber;
    private boolean frozen;

    public BankAccount(String name, String AccNumber, double balance, boolean frozen) {
        this.AccHolderName = name;
        this.AccNumber = AccNumber;
        this.balance = balance;
        this.frozen = frozen;
    }

    public String getAccHolderName() {return AccHolderName;}
    public String getAccNumber() {return AccNumber;}
    public double getBalance() {return balance;}
    public boolean isFrozen() {return frozen;}


    public void deposit(double amount)
        throws AccountFrozenException {

        InvalidAmountException.validateAmount(amount);
        AccountFrozenException.checkAccountStatus(frozen, AccNumber);

        balance += amount;

        System.out.println("Deposited: Rs." + amount);
        System.out.println("Current Balance: Rs." + balance);
    }

    public void withdraw(double amount) 
        throws AccountFrozenException, InsufficientBalanceException {

        InvalidAmountException.validateAmount(amount);
        AccountFrozenException.checkAccountStatus(frozen, AccNumber);
        InsufficientBalanceException.validateInsufficientBalance(AccNumber, balance, amount);

        balance -= amount;

        System.out.println("Withdrawn: Rs." + amount);
        System.out.println("Remaining Balance: Rs." + balance);
    }

}

