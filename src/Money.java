abstract class Money  {
   protected String currency;

    Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
    }

   static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }

   abstract Money times(int multiplier);

    static Money franc(int amount) {
      return new Franc(amount, "CHF");
    }  

    String currency(){
        return currency;
    }
}