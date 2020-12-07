package com.company;

//  III-
public class Account {
    private String name;
    private String address;
    private double balance;

    public Account(String name, String address, double balance) {

        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    //Name Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (!newName.equals("")) {
            this.name = newName;
        }
    }

    //Address Setter and Getter
    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        if (!newAddress.equals("")) {
            this.address = newAddress;
        }
    }

    //Balance Setter and Getter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance > 0) {
            this.balance = newBalance;
        }
    }

    public double calculateInteret(double tauxInteret) {
        double soldInteret = this.getBalance() * tauxInteret * 2 / 100;
        return soldInteret;
    }

    public void withdraw(double x) {
        if (x >= this.getBalance()) {
            //this.setBalance(this.getBalance() - x);
            throw new RuntimeException("Operation failed !");
        }

        balance = balance - x;
        System.out.println("Withdraw =" + x + " DH");

    }

}
