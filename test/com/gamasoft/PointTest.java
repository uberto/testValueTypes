package com.gamasoft;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class PointTest {

    private Point[] createArray() {
        Point[] values = new Point[1000];
        for (int i = 0, k = 0; i < values.length; i++, k += 2) {
            values[i] = new Point(k, k + 1);
        }
        return values;
    }


    @Test
    void testArrayTest(){

        var points = createArray();

        assertEquals(1000, points.length);
    }




}