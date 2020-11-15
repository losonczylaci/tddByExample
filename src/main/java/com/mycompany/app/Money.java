package com.mycompany.app;

public class Money implements Expression {

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

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    String currency() {
        return currency;
    }

    public Money reduce(String to) {
        return this;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String toString() {
        return amount + " " + currency;
    }

    protected int amount;
    protected String currency;
}
