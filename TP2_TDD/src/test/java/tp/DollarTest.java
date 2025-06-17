package tp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
