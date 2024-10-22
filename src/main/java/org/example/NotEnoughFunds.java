package org.example;

public class NotEnoughFunds extends RuntimeException {
    public NotEnoughFunds(String message) {
        super(message);
    }
}
