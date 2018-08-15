package com.gamasoft;

final __ByValue  class Cat implements Animal {


    public final String name;

    Cat(String name) {
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
}
