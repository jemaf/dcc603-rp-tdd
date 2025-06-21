package tests;

import org.junit.Assert;
import org.junit.Test;

import src.Dollar;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}
