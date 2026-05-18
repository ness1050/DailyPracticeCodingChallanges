package controller;

import model.Account;
import model.Services;
import view.Userinterface;

public class BankController {

    private final Userinterface userinterface;
    private final Services services;

    public BankController() {
        this.userinterface = new Userinterface();
        this.services = new Services();
    }

    public void run() {
        boolean running = true;

        while(running) {

            userinterface.showMainMenu();
            int choice = userinterface.getUserChoice();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 8: 
                    System.out.println(services.getAllAccounts());
            
                default:
                    break;
            }
        }
    }
    
    private void createAccount() {
        try {
            String name = userinterface.getUserName();
            String email = userinterface.getEmail();
            int typeChoice = userinterface.getUserChoice();
            double Initial = userinterface.getInitialDeposit();

            String accountTyoe = typeChoice == 1 ? "Saving" : "Current";

            Account newAccont = services.createAccount(name, email, accountTyoe, Initial);

            userinterface.displayAccountCreated(
                newAccont.getAccountNumber(),
                newAccont.getUser().getName(),
                accountTyoe
            );


        } catch (Exception e) {
            // TODO: handle exception
            userinterface.displayError("Error failed to create an account : " + e.getMessage());
        }
    }

    public static void main(String [] args) {
        new BankController().run();
    }
}
