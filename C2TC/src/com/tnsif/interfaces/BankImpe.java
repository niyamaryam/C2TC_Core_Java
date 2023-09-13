package com.tnsif.interfaces;

ublic class BankImpl implements Bank {

    @Override
    public void deposit(Account account, double amount) {
        // TODO Auto-generated method stub
        if (amount > DEPOSIT_LIMIT) {
            System.err.println("Deposit not possible....Limit exceeded");
        } else {
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("Money Deposited");
        }
    }

    @Override
    public void withdraw(Account account, double amount) {
        // TODO Auto-generated method stub
        if (account.getBalance() - amount >= MIN_BALANCE) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            System.out.println("Money Withdrawn");
        } else {
            System.err.println("Insufficient Balance");
        }
    }
}
