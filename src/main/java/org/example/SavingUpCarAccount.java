package org.example;

import java.math.BigDecimal;

public class SavingUpCarAccount extends BankAccount {
    private final int accountNumber;
    private final BigDecimal balance;

    public SavingUpCarAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
