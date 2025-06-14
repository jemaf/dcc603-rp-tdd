import static org.junit.Assert.*;

import java.beans.Expression;

import org.junit.Test;

/**
 *  Testes de unidade para Dollar e Franc.
 *  (Arquivo completo para evitar erros de chaves.)
 */
public class MoneyTest {

    @Test
    public void testDollarMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
        assertEquals(new Dollar(5), five);  // objeto original permanece 5
    }

    @Test
    public void testDollarEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
    @Test
public void testSimpleAddition() {
    Money five = new Dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money result = bank.reduce(sum, "USD");
    assertEquals(new Dollar(10), result);
    
}
}