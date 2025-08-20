package com.bank;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private Customer customer;

    public BankAccount(Customer customer, String accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-=amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String toSring(){
        return "Account[" + accountNumber + ", Balance=" + balance + ", Customer=" + customer.getName() + "]";
    }
}
