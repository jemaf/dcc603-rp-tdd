public class Money {
   protected int amount;

   public Money(int amount) {
       this.amount = amount;
   }

   @Override
   public boolean equals(Object object) {
      if (object == null) {
          return false;
      }
      if (getClass() != object.getClass()) {
          return false;
      }

      Money money = (Money) object;
      return amount == money.amount;
   }

   @Override
   public int hashCode() {
       return Integer.hashCode(amount);
   }
}