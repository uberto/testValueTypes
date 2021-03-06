package com.ubertob.examples;

import com.ubertob.aggregates.User;

public class FlattenedStrings {

    public static void userMemorySize() {
        User fred = new User("Fred", "Smith");
        User mary = new User("Mary Tyler Moore", "Moore");
        User fred2 = new User("Fred ", "Smith");

        System.out.println(fred.getName());
        System.out.println(mary.getName());
        System.out.println(fred == fred2);

        var memBefore = Runtime.getRuntime().freeMemory();
        var values = new User[1_000_000];
        var memUsed = memBefore - Runtime.getRuntime().freeMemory();
        System.out.println("Memory for 1M User " + memUsed); //8MB
        System.out.println("User default " + values[0]); //0,0
    }
}
