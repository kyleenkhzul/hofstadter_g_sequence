package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HofstadterTest {

    @Test
    void testHofstaderGSequenceNumber0() {
        assertEquals(0, Hofstadter.calculateHofstadterNumber(0));
    }

    @Test
    void testHofstaderGSequenceNumber1() {
        assertEquals(1, Hofstadter.calculateHofstadterNumber(1));
    }

    @Test
    void testHofstaderGSequenceNumber2() {
        assertEquals(1, Hofstadter.calculateHofstadterNumber(2));
    }

    @Test
    void testHofstaderGSequenceNumber3() {
        assertEquals(2, Hofstadter.calculateHofstadterNumber(3));
    }

    @Test
    void testHofstaderGSequenceNumber4() {
        assertEquals(3, Hofstadter.calculateHofstadterNumber(4));
    }

    @Test
    void testHofstaderGSequenceNumber5() {
        assertEquals(3, Hofstadter.calculateHofstadterNumber(5));
    }

    @Test
    void testHofstaderGSequenceNumber6() {
        assertEquals(4, Hofstadter.calculateHofstadterNumber(6));
    }
}
