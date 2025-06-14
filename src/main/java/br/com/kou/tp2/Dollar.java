package br.com.kou.tp2;

class Dollar extends Money{
    private int amount;

    Dollar(int amount) {
        this.amount= amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}