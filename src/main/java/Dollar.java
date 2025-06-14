class Dollar {
    final int amount;             // agora imutável

    Dollar(int amount) {
        this.amount = amount;
    }

    // devolve NOVO Dollar
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    // compara pelo campo amount
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dollar)) return false;
        Dollar other = (Dollar) obj;
        return this.amount == other.amount;
    }
}
