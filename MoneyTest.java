package Test_Driven_Development_Practical_Assignemnt_UFMG;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testEquality() {
   assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
   assertFalse(Money.franc(5).equals(Money.dollar(5)));
}	
}
