class BankAccount {
    private String accountNumber;   
    private double balance;
    
    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Amount withdrawn:"+amount);
            System.out.println("Amount Withdrawn");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void display(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}
