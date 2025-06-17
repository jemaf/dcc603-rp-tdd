import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void testEquality() {
       assertTrue(new Dollar(5).equals(new Dollar(5)));
       assertFalse(new Dollar(5).equals(new Dollar(6)));
       assertTrue(new Franc(5).equals(new Franc(5)));
       assertFalse(new Franc(5).equals(new Franc(6)));
    }
}