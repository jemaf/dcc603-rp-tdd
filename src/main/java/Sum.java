class Sum implements Expression {
    final Expression augend;
    final Expression addend;

    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        Money reducedAugend = augend.reduce(bank, toCurrency);
        Money reducedAddend = addend.reduce(bank, toCurrency);
        int amount = reducedAugend.amount + reducedAddend.amount;
        return Money.of(amount, toCurrency);  
    }

    @Override
    public Expression plus(Expression add) {
        return new Sum(this, add);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}
