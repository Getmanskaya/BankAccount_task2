package org.example;

import java.math.BigDecimal;

import static java.awt.AWTEventMulticaster.add;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;

    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.valueOf(2500);

        SavingUpCarAccount accountCar = new SavingUpCarAccount(62558621, new BigDecimal(2300));
        accountCar.deposit(amount);
    }

    //текущий баланс
    public BigDecimal currentBalance(BigDecimal balance) {
        return (balance);
    }

    //пополнение счета
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    //снятие со счета
    public void withdraw(BigDecimal amount) {
        if (currentBalance(balance).compareTo(amount) < 0) {
            throw new NotEnoughFunds("Недостаточно средств");
        }
        balance = balance.subtract(amount);
    }
}
