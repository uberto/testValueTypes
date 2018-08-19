package com.gamasoft.animals;

__ByValue  public class Cat implements Animal {


    public final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String sound() {
        return "meow";
    }

    @Override
    public String toString() {

        return super.toString() +  "  Cat Value " + name;
    }
}
