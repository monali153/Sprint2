package com.jap.customexception;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account(20000);
        Account account1 = new Account(40000);

        try {
            account1.withdraw(2000);
            System.out.println("Account Balance = " + account1.getAccountBalance());
            account.withdraw(30000);
            System.out.println("Account Balance = " + account.getAccountBalance());
        } catch (InsufficientFundException e) {
            System.out.println(e);
        }

    }
}
