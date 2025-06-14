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

abstract class Money  {
   protected int amount;

   static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
	
   abstract Money times(int multiplier);  

   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }
			
}
// parei no money.franc
class Dollar extends Money {

   Dollar(int amount) {
      this.amount= amount;
   }

   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
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
				
   Franc(int amount) {      
      this.amount= amount;
    }

    Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }	
}
