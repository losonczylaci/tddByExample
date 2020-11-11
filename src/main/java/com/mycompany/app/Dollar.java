package com.mycompany.app;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(multiplier * this.amount);
    }

}
