package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("this is supposed to return 5", 5, five.intValue());
        Integer six = 6;
        assertEquals("intValue returns int 6", 6, six.intValue());
    }

    @Test
    public void convertToHex() {
        assertEquals("hex 11 is b", "b", Integer.toHexString(11));
        assertEquals("hex 10 is a", "a", Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3", Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15", Integer.toHexString(21));
    }

    @Test
    public void checkMinMaxValue() {
        assertEquals("MIN_VALUE equals -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("MAX_VALUE equals 2147483647",2147483647, Integer.MAX_VALUE);
    }
}
