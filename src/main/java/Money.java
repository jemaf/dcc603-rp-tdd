public abstract class Money {
   protected int amount;
   protected String currency;

   public Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }

   public static Dollar dollar(int amount)  {
      return new Dollar(amount, "USD");
   }
   
   public static Franc franc(int amount) {
      return new Franc(amount, "CHF");
   }
	
   public abstract Money times(int multiplier);
   
   public String currency() {
      return currency;
   }

   @Override
   public boolean equals(Object object) {
      if (object == null) {
          return false;
      }
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }

   @Override
   public int hashCode() {
       return Integer.hashCode(amount);
   }
}