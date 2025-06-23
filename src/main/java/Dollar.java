class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }
    @Override
    String currency() {
        return currency;
    }
}