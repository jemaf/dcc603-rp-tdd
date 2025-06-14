class Dollar extends Money {

    Dollar(int amount) {
        super(amount);
    }

    @Override
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    @Override String currency() { return "USD"; }

}
