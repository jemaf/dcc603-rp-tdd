package Test_Driven_Development_Practical_Assignemnt_UFMG;

public class Franc extends Money {   					
   
   
    Franc(int amount,String currency) {      
      super(amount,currency);
    }					
    Money times(int multiplier)  {      
       return Money.franc(amount*multiplier);					
    }
    
    String currency(){
        return currency;
    }

    					
}