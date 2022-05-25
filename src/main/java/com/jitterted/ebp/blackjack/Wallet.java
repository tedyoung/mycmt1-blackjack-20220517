package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance;

    public Wallet() {
        balance = 0;
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireAmountGreaterThanZero(amount);

        balance += amount;
    }

    public int balance() {
        return balance;
    }

    public void bet(int betAmount) {
        requireSufficientBalance(betAmount);
        balance -= betAmount;
    }

    private void requireAmountGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    private void requireSufficientBalance(int betAmount) {
        if (betAmount > balance) {
            throw new IllegalStateException();
        }
    }
}
