package com.gamasoft;

final __ByValue  class Dog implements Animal {

    public final String name;

    Dog(String name) {
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
