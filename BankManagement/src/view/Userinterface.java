package view;

import java.util.Scanner;

public class Userinterface {
    
    public Scanner scan;

    public void showMainMenu() {
        System.out.println("\n");
        System.out.println("Welcome to Java bankingSystem");
        System.out.println("--------------------------------");
        System.out.println("1.Create new account");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Transfer Money");
        System.out.println("5.Check balance");
        System.out.println("6.View Transaction History");
        System.out.println("7.Exit");
    }

    public String displayError(String message) {
        return ("Error due to: " + message);
    }

    public String displaySuccess(String message) {
        return ("Hurra!" + message);
    }

    public int getUserChoice() {
        System.out.println("Enter your choice 1-7");
        while (scan.hasNext()) {
            scan.nextLine();            
        }

        int choice = scan.nextInt();
        scan.close();
        return choice;
    }

    public String getUserName() {
        System.out.println("Enter your name: ");

        return scan.nextLine();
    }

    public String getEmail() {
        System.out.println("Enter your email: ");
        return scan.nextLine();
    }

    public int getAccountType() {
        System.out.println("Select Accout type");
        System.out.println("1.Saving account");
        System.out.println("2.Current accont");
        System.out.println("Enter Choice: ");
        return scan.nextInt();
    }

    public double getInitialDeposit() {
        System.out.println("Enter Initial Deposit Amount : ");
        return scan.nextDouble();
    }

   
    public void displayAccountCreated(String accountNumber, String customerName, String type) {
        System.out.println("\n🎉 Account Created Successfully!");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + type);
    }
    

    public void close() {
        scan.close();
    }

}
