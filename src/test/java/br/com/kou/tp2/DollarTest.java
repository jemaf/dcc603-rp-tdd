package br.com.kou.tp2;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
