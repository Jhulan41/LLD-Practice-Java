package com.bank;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Jhulan", "jhulan41@gmail.com");
        Customer c2 = new Customer("Milan", "milan98@gmail.com");

        BankAccount bankAccount1 = new BankAccount(c1, "12345");
        BankAccount bankAccount2 = new BankAccount(c2, "54321");

        bankAccount1.deposit(5000);
        System.out.println(bankAccount1.toSring());

        bankAccount2.deposit(2000);
        System.out.println(bankAccount2.toSring());


        bankAccount2.withdraw(200);
        System.out.println(bankAccount2.toSring());


        bankAccount1.withdraw(9000);
        System.out.println(bankAccount1.toSring());

        System.out.println(c1.toString());
        System.out.println(c2.toString());


    }
}