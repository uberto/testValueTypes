package com.gamasoft.animals;

public interface Animal {
    String name();

    String sound();

    default void defMethod() {
        System.out.println("hello");
    }

}
