package com.gamasoft;

public class Shark implements Animal {
    @Override
    public String name() {
        return "shark";
    }

    @Override
    public String sound() {
        return "..";
    }

    @Override
    public String toString() {
        return "Shark{}";
    }
}
