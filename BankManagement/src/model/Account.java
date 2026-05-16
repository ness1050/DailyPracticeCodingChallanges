package BankManagement.src.model;

import java.util.ArrayList;
import java.util.List;

public  class Account {

    private final String accountNumber;
    private double balance;
    private final User user;
    protected final List<tranisition> Transitions = new ArrayList<>();

    public Account (String accountNumber, User user, double balance) {
        this.accountNumber = accountNumber;
        this.user = user;
        this.balance = balance;
    }

    
}
