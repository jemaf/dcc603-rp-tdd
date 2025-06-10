public class Franc extends Money {
    private int amount;
    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
    }
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    String currency() {
        return currency;
    }
}