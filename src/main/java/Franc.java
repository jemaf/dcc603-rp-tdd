class Franc extends Money {

    Franc(int amount) {
        super(amount);
    }

    @Override
    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    @Override String currency() { return "CHF"; }

}
