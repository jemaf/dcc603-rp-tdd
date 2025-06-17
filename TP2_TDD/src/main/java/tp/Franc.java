package tp;

class Franc extends Money{
    private int amount;
    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
    }

    String currency() {
        return "CHF";
    }
}
