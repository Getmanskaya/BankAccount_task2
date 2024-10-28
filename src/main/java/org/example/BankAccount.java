package org.example;

import java.math.BigDecimal;

import static java.awt.AWTEventMulticaster.add;

public class BankAccount {
    private final int accountNumber;
    private BigDecimal bankBalance;

    public BankAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.bankBalance = balance;
    }

    //текущий баланс
    public BigDecimal currentBalance(BigDecimal balance) {
        return (balance);
    }

    //пополнение счета
    public void deposit(BigDecimal amount) {
        bankBalance = bankBalance.add(amount);
    }

    //снятие со счета
    public void withdraw(BigDecimal amount) {
        if (currentBalance(bankBalance).compareTo(amount) < 0) {
            throw new NotEnoughFunds("Недостаточно средств");
        }
        bankBalance = bankBalance.subtract(amount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBankBalance() {
        return bankBalance;
    }

}
