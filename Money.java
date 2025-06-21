package Test_Driven_Development_Practical_Assignemnt_UFMG;

class Money  {
   protected int amount;
   
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount;
   }   
}
