class Dollar {
    private final int amount;          // agora privado e final

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);   // imutável
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dollar)) return false;
        Dollar other = (Dollar) obj;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        return amount;                  // boa prática ao sobrescrever equals
    }
}
