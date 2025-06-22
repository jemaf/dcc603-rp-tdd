
public class FrancTest {
    public void testEquality() {
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    public void testCurrency() {
        assertEquals("CHF", Money.franc(1).currency());
    }
}
