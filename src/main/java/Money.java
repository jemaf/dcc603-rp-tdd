/**
 * Superclasse para moedas.
 */
abstract class Money {
    protected final int amount;

    Money(int amount) {
        this.amount = amount;
    }

    abstract Money times(int multiplier);  // cada subclasse devolve seu tipo

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) return false;
        Money other = (Money) obj;
        // mesmo valor E mesma classe
        return this.amount == other.amount &&
               this.getClass() == other.getClass();
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
