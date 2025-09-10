package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DegreePrintTest {
    
    @Test
    void testBScDuration1() {assertEquals(4, DegreePrint.Years("msc"));}

    @Test
    void testBScDuration2() {assertEquals(0, DegreePrint.Years("lukio"));}

    @Test
    void testBScDuration3() {assertEquals(99, DegreePrint.Years(null));
    }

    @Test
    void testBScDuration4() {assertEquals(98, DegreePrint.Years("null"));
    }
}
