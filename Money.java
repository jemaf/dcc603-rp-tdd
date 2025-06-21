package Test_Driven_Development_Practical_Assignemnt_UFMG;

class Money  {
   protected int amount;
   protected String currency;

   Money(int amount,String currency){
    this.amount=amount;
    this.currency=currency;
   }
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }
    static Money dollar(int amount)  {
      return new Money(amount,"USD");
   }
    static Money franc(int amount)  {
      return new Money(amount,"CHF");
   }
   Money times(int multiplier){
    return new Money(amount*multiplier,currency);
   }
   String currency(){
        return currency;
   }


}
