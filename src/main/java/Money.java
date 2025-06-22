public class Money {
   protected int amount;
   protected String currency;

   public Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }

   public static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }
   
   public static Money franc(int amount) {
      return new Money(amount, "CHF");
   }
	
   public Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   }
   
   public String currency() {
      return currency;
   }

   @Override
   public boolean equals(Object object) {
      if (object == null) {
          return false;
      }
      if (!(object instanceof Money)) {
          return false;
      }
      Money money = (Money) object;
      return amount == money.amount && currency().equals(money.currency());
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + amount;
       result = prime * result + ((currency == null) ? 0 : currency.hashCode());
       return result;
   }
}