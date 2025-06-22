package test.java;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.*;

public class Tests {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}