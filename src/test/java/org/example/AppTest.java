package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    int a = 4;
    int b = 3;
    int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void testAdd() {

        assertEquals(Calculette.add(a, b), 8);
    }

    @Test
    public void testSub() {

        assertEquals(Calculette.sub(a, b), 1);
    }

    @Test
    public void testMul() {

        assertEquals(Calculette.mul(a, b), 12);
    }

    @Test
    public void testDiv() {

        assertEquals(Calculette.div(a, b), 1.33, 0.01);
    }

    @Test
    public void testAvg() {

        assertEquals(Calculette.avg(c), 5, 0.01);
    }

}
