package com.gamasoft.animals;

import com.gamasoft.animals.Shark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {


    @Test
    void sharkArray(){

        var sharks = new Shark[1000];

        assertEquals(1000, sharks.length);
    }

}