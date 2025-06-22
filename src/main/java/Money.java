public abstract class Money {
   protected int amount;

   public Money(int amount) {
       this.amount = amount;
   }

   public static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
   
   public static Franc franc(int amount) {
      return new Franc(amount);
   }
	
   public abstract Money times(int multiplier);

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