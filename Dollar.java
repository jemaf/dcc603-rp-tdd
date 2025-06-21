package Test_Driven_Development_Practical_Assignemnt_UFMG;

public class Dollar extends Money{
    
    
    public Dollar(int amount) {
       this.amount=amount;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }

    
}