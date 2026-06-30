class BankAccount {
    private String accountHolder;
    private double amount;

    public void setAccountHolder (String name){
        this.accountHolder = name;
    }

    public void setAmount (double amt){
        this.amount = amt;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getAmount(){
        return amount;
    }
}


public class EncapsulationExample {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.setAccountHolder("Bizesh");
        ba.setAmount(2000);

        System.out.println("Account Holder: " + ba.getAccountHolder());
        System.out.println("Balance: " + ba.getAmount());
    }
}
