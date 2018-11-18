package com.gamasoft.animals;

value public class Dog implements Animal {

    public final String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public String sound() {
        return "woof";
    }
}
