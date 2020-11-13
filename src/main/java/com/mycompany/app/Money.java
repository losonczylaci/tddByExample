package com.mycompany.app;

public class Money {

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency == money.currency;
    }

    Money times(int multiplier) {
        return new Money(multiplier * this.amount, currency);
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String toString() {
        return amount + " " + currency;
    }

    protected int amount;
    protected String currency;
}
