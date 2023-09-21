package com.tnsif.interfaces;

public class Executor{

    public static void main(String[] args) {
        Bank bank = new BankImpe();
        //create an account
        Account account = new Account(123456, "Avantika", 5, bank);

        //Deposite money
        account.deposit(2000);
        //print the account details
        System.out.println(account);
        
        //withdraw money
        account.withdraw(10000);
        //print the account details
        System.out.println(account);

}

}
