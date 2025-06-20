abstract class Money  {
   protected String currency;

    static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }

    static Money franc(int amount) {
      return new Money(amount, "CHF");
    }  

    Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
    }

   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }

    Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   }
    String currency(){
        return currency;
    }
}