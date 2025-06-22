public class Franc extends Money{
    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return "CHF";
    }

    Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
    }
}
