package org.example;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.valueOf(250);
        BankAccount account = new BankAccount(325646, BigDecimal.valueOf(900));
        account.getAccountNumber();
        account.withdraw(amount);
        // account.deposit(amount);
        System.out.println(account.getBankBalance());
        System.out.println(account.getAccountNumber());
    }
}
