public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount("12345",8934.00);
        account.display();
        account.deposit(3456.98);
        account.withdraw(345.99);
        account.withdraw(768.99);
        account.display();
    }
}
