abstract class Money implements Expression {
    protected final int amount;

    Money(int amount) {
        this.amount = amount;
    }

    // devolve uma soma (this + addend)
    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    // ---- novo: método abstrato exigido pela interface ----
    public abstract Money times(int multiplier);

        abstract String currency();

    static Money of(int amount, String currency) {
        return "USD".equals(currency) ? new Dollar(amount)
                                      : new Franc(amount);
    }


    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int rate = bank.rate(this.currency(), toCurrency);
        return Money.of(amount / rate, toCurrency);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) return false;
        Money other = (Money) obj;
        return this.amount == other.amount &&
               this.getClass() == other.getClass();
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
