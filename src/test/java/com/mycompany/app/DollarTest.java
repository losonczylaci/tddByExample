package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert.*;

public class DollarTest {

    @Test
    public void testMutlitplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
