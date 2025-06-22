class Dollar extends Money{
    private int amount = 10;
    Dollar(int amount){
        this.amount = amount;
    }
    Money times(int multiplier) {
       return new Dollar(amount * multiplier);
    }
}