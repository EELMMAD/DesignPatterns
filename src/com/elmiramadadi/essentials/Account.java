package com.elmiramadadi.essentials;

public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount >= 0)
            balance += amount;    //augmented assignment  +=
    }

    public void withdraw(float amount) {
        if (amount > 0)
            balance -= amount;
    }
    
    public float getBalance() {
        return balance;
    }
}
