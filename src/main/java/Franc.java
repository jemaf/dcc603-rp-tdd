public class Franc extends Money {   
   private int amount;
   private String currency;
					
   Franc(int amount, String currency) {      
        super(amount, currency);

    }					
    Money times(int multiplier)  {      
       return new Money.franc(amount * multiplier);					
    }   
    String currency() {
      return currency;
   }					
}