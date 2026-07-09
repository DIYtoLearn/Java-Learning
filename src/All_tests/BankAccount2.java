package All_tests;


interface Accounts{
     double calculateServiceCharge(double transactionAmount);
}

class Savings implements Accounts{
    private String accountId;
    private double balance;

    Savings(){
        accountId = null;
        balance = 0.0;
    }

    Savings(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

      public double calculateServiceCharge(double transactionAmount)
    {
        return transactionAmount * 0.01;

    }
}

class Current implements Accounts{
    private String accountId;
    private double balance;

    Current(){
        accountId = null;
        balance = 0.0;
    }

    Current(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

    public double calculateServiceCharge(double transactionAmount)
    {
        return transactionAmount * 0.02;

    }
}

class Premium implements Accounts{
    private String accountId;
    private double balance;

    Premium(){
        accountId = null;
        balance = 0.0;
    }

    Premium(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

    public double calculateServiceCharge(double transactionAmount)
    {
        return transactionAmount * 0.03;

    }
}



public class BankAccount2 {
    public static void main(String[] args) {
        Accounts acc = new Current();
        double res = acc.calculateServiceCharge(100);
        System.out.println(res);

    }
}