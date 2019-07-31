package com.ubertob.aggregates;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testArrayMemory(){

        var memBefore = Runtime.getRuntime().freeMemory();
        var values = new User[1_000_000];
        var memUsed = memBefore - Runtime.getRuntime().freeMemory();
        System.out.println("Memory for 1M User " + memUsed); //8MB
        System.out.println("User default " + values[0]); //0,0

    }

}
