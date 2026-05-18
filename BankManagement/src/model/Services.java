package model;

import java.util.ArrayList;
import java.util.List;

public class Services {
    
    private final List<Account> accounts = new ArrayList<>();

    private int accountCounter = 1000;

    public Account createAccount(String name, String email, String accountType, double initials) {
        String customerId = "User" + (accountCounter);
        String accountNumber = "Acc" + (accountCounter++);

        User user = new User(customerId, name, email);

        Account account;
        if (accountType.equals("Savings")) {
            account = new Account(accountNumber, user, initials);
        }  else {
            account = new Account(accountNumber, user, initials);
        }
        
        accounts.add(account);
        return account;
        
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
    public void login(User user) {

    }

    public void logout(User user) {

    }



    
}
