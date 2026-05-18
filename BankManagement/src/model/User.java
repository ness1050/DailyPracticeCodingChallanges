package model;

import java.util.List;

public  class User {

    private String password, name, email;
    private int Userid;

    private List<Account> accounts;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void nullChecker(String x) {
        if (x.isEmpty()) {
            throw new IllegalArgumentException("You have not entered ");
        } else {
            return;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    
    
}
