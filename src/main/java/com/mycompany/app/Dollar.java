package com.mycompany.app;

public class Dollar {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(multiplier * this.amount);
    }

    int amount;
}
