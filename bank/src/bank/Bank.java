
package bank;

import java.util.Scanner;

class BankAccount{
    private double balance;
    private String owner;
    private String accountNumber;
    int numberOfAccounts;
    
    public BankAccount(){
    
    }
    
    public BankAccount(String name, double amount, String account){
        owner = name;
        balance = amount;
        accountNumber = account;
    }
    
    public BankAccount(BankAccount oldAccount, double amount){
        
         this.owner = oldAccount.owner;
        if(oldAccount.balance>=amount){
            oldAccount.withdraw(amount);
            this.balance = amount;
            
        }
    }
    
    public BankAccount(BankAccount oldAccount, double amount, String account){
        
        this.accountNumber = account;
        this.owner = oldAccount.owner;
        if(oldAccount.balance>=amount){
            oldAccount.withdraw(amount);
            this.balance = amount;
            
        }
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public boolean withdraw(double amount){
        if(balance>=amount){
        balance -=amount;
        return true;
        }
        else
            return false;
        
    }
    
    public double getBalance(){
        
        return balance;
        
    }
    
    public String getOwner(){
        return owner;
        
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public void setBalance(double amount){
        balance = amount;
        
    }
    
    public void setAccountNumber(String newAccountNumber){
        accountNumber = newAccountNumber;
    }
    
    public String toString(){
        return("Name: "+ owner + ", Account Number: "+ accountNumber + ", Amount: "+ balance );
    }
}

class CheckingAccount extends BankAccount{
    
    private double Fee;
    public CheckingAccount(String name, double amount, String acc){
        super(name, amount, acc);
    }

    
    public boolean withdraw(double amount){
        if(amount>getBalance()){
            return false;
        }
        else{
            double bal = getBalance()- amount;
            setBalance(bal);
            return true;
        }
            
    }
    
    public String getAccNum(){
       return getAccountNumber();
    }
    
    
}

class SavingsAccount extends BankAccount{
    private double rate;
    private int savingsNumber;
    private String accountNumber;
    
    public SavingsAccount(String name, double amount, String acc){
        super(name, amount, acc);
    }
    
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        
        super(oldAccount, amount);
    }
    
    public SavingsAccount(SavingsAccount oldAccount, double amount, String acc){
        
        super(oldAccount, amount, acc);
        
    }
    
    public void postInterest(){
        rate= 0.1;
        double bal = getBalance()*0.1;
        setBalance(bal + getBalance());
    }
    
    public String GetAccountNumber(){
        return accountNumber;
    }
}


public class Bank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount[] bank = new BankAccount[5];
        
        bank[0]= new SavingsAccount("Rida", 10000, "A1234");
        System.out.println("Old account for Savings Account---> "+bank[0]);
        bank[1]= new SavingsAccount((SavingsAccount)bank[0],300, "B1234");
        System.out.println("New account for Savings Account---> "+bank[1]);
        ((SavingsAccount)bank[1]).postInterest();
        System.out.println("Total Balance for New Account after post Interest: " +bank[1].getBalance());
        System.out.println("Can the amount be withdrawn from Old Account? "+bank[0].withdraw(100));
        System.out.println("Can the amount be withdrawn from New Account? "+bank[1].withdraw(5000));
        System.out.println("Do you want to set a new account number?");
        boolean check = in.nextBoolean(); 
        if (check==true){
            System.out.println("Enter your account number");
            String input = in.next();
            bank[0].setAccountNumber(input);
        }
        System.out.println("Your new Account Number: "+ bank[0].getAccountNumber());
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("");
        bank[2] = new CheckingAccount("Farha", 10000, "C1234");
        System.out.println("Checking Account---> "+ bank[2]);
        System.out.println("Can the amount be withdrawn from Checking Account? "+bank[2].withdraw(500));
        System.out.println("The current balance in Checking Account after withdrawal: " + bank[2].getBalance());
        bank[2].deposit(200);
        System.out.println("The Amount after deposition: "+ bank[2].getBalance());
        
    }
    
}
