public class BankAccount {
    private double balance;

    public BankAccount(double openingBalance){
        balance = openingBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.println("Balance=" + balance);
    }
}
