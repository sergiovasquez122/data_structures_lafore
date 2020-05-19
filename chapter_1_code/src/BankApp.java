public class BankApp {
    public static void main(String[] args) {
        BankAccount bal = new BankAccount(100);

        System.out.println("Before transactino, ");
        bal.display();

        bal.deposit(74.35);
        bal.withdraw(20);

        System.out.println("After Transactions");
        bal.display();
    }
}
