abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Franc franc(int amount)  {
        return new Franc(amount, "CHF");
    }

    static Dollar dollar(int amount)  {
        return new Dollar(amount, "USD");
    }

    abstract Money times(int multiplier);
}