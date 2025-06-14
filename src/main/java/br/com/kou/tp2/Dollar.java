package br.com.kou.tp2;

class Dollar extends Money{
    private int amount;
    private String currency;

    Dollar(int amount, String currency)  {
        super(amount, currency);
    }

    Money times(int multiplier)  {
        return Money.dollar(amount * multiplier);
    }

    String currency() {
        return "USD";
    }
}