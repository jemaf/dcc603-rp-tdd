package com.rptdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {
    
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
}
