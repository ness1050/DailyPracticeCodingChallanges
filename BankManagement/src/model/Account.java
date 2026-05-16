package BankManagement.src.model;

import java.util.ArrayList;
import java.util.List;

public  class Account {

    private final String accountNumber;
    private double balance;
    private final User user;
    protected final List<Transaction> transactions = new ArrayList<>();

    public Account (String accountNumber, User user, double balance) {
        this.accountNumber = accountNumber;
        this.user = user;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return this.user;
    }


    public List<Transaction> getTransitions() {
        return this.transactions;
    }

    
    public void deposit(double amount) {
        if (amount <= 0 ) throw new IllegalArgumentException("No valid amount");
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));

    }
   
    public void withdrawl(double amount) {
        if (amount <= 0 || amount < balance) throw new IllegalArgumentException("No effiecent ammount");
        balance -= amount;
        transactions.add(new Transaction("Withdrawl", amount));
        
    }

    public void getbalance() {
        this.balance = balance;
    }

    

}
