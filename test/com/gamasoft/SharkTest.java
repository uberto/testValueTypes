package com.gamasoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {


    @Test
    void sharkArray(){

        var sharks = new Shark[1000];


        var points = new Point[1000];


        assertEquals(1000, sharks.length);
    }

}