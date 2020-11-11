package com.mycompany.app;

public class Franc {

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(multiplier * this.amount);
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }

    private int amount;
}
