package Classwork.Jul23;

// 2. Create a BankAccount class using encapsulation data members: accountNumber, accountHolder and balance.
//     Methods: deposit, withdraw, display balance

public class BankAccount {
    private double balance;
    private String AccHolderName;
    private int AccNumber;

    public BankAccount(String name, int AccNumber, double balance) {
        this.AccHolderName = name;
        this.AccNumber = AccNumber;
        this.balance = balance;
    }

    public String getAccHolderName() {return AccHolderName;}
    public int getAccNumber() {return AccNumber;}
    public double getBalance() {return balance;}

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Ammount Deposited: " + amt);
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(double amt) {
        balance -= amt;
        System.out.println("Ammount Withdrawn: " + amt);
        System.out.println("Balance after withdraw: " + balance);
    }

    public void checkBalance() {
        System.out.println("Balance checked: " + balance);
    }

}

