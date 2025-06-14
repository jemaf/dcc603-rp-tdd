public void testEquality() {
   assertTrue(Money.dollar(5).equals(Money.dollar(5)));
   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
   assertTrue(Money.franc(5).equals(Money.franc(5)));
   assertFalse(Money.franc(5).equals(Money.franc(6)));
   assertFalse(Money.franc(5).equals(Money.dollar(5)));
}

public void testFrancMultiplication() {
   Money five = Money.franc(5);
   assertEquals(Money.franc(10), five.times(2));
   assertEquals(Money.franc(15), five.times(3));
}

public void testCurrency() {
   assertEquals("USD", Money.dollar(1).currency());
   assertEquals("CHF", Money.franc(1).currency());
}

abstract class Money  {
   protected int amount;
   protected String currency;

   abstract String currency();

   static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }

   static Money franc(int amount) {
      return new Franc(amount, "CHF");
   }

   Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
	
   abstract Money times(int multiplier);  

   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }
			
}
// parei no money.franc
class Dollar extends Money {

   Dollar(int amount, String currency)  {
      super(amount, currency);
   }

   String currency() {
      return "USD";
   }

   Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }

   public void testMultiplication() {
      Dollar five = new Dollar(5);
      five.times(2);
      assertEquals(10, five.amount);
   }
}

public void testFrancMultiplication() {
   Franc five = new Franc(5);
   assertEquals(new Franc(10), five.times(2));
   assertEquals(new Franc(15), five.times(3));
}

class Franc extends Money {

   Franc(int amount, String currency) {
      super(amount, currency);
   }

   String currency() {
      return "CHF";
   }

   Money times(int multiplier)  {
      return Money.franc(amount * multiplier);
   }
}
