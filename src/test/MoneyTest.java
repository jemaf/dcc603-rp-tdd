import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
	
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}	
	
}
