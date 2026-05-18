package controller;

import view.Userinterface;

public class BankController {

    private final Userinterface userinterface;

    public BankController() {
        this.userinterface = new Userinterface();
    }

    public void run() {
        boolean running = true;

        while(running) {

            userinterface.showMainMenu();
            int choice = userinterface.getUserChoice();
            
        }
    }
    
    public static void main(String [] args) {
        new BankController().run();
    }
}
