package All_tests;

class BankAccount
{

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount added to account");

    }

    public void withdraw(double amount)
    {
        if((balance - amount) <= 0)
            System.out.println("Insufficient Balance");

        else {
            balance = balance - amount;
            System.out.println("withdrawn successfully"); }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setBalance(double newBal)
    {
        balance = newBal;
    }
}

class SavingsAccount extends BankAccount{

    double interestRate;

    SavingsAccount(double interestRate, String accountNumber, double balance)
    {
        this.interestRate = interestRate;
        super(accountNumber, balance);
    }

    public void addInterest()
    {
        double bal = getBalance();
        bal += bal*interestRate;
        setBalance(bal);
    }
}


public class ClassTest2 {
    public static void main(String[] args) throws InterruptedException {

        BankAccount Ba = new BankAccount("AD11",1100);
        System.out.println("Account Number "+Ba.getAccountNumber()+" \nBalance "+Ba.getBalance());
        Ba.deposit(200);
        System.out.println("New Balance "+Ba.getBalance());
        Ba.withdraw(400);
        System.out.println("New Balance "+Ba.getBalance()+"\n\n");
        Thread.sleep(2000);
        // Ba.balance; // getting error :  balance' has private access in 'All_tests.BankAccount'

        SavingsAccount Sa = new SavingsAccount(0.04, "S202", 2000);
        System.out.println("Account Number "+Sa.getAccountNumber()+"\nBalance "+Sa.getBalance());
        Sa.addInterest();
        System.out.println("New balance after interest applied "+Sa.getBalance());

    }
}