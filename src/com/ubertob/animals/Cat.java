package com.ubertob.animals;

inline public class Cat implements Animal {

    public final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String name() {
//        return super.toString(); //Error: value types do not support invocation of super.toString
        return name;
    }

    @Override
    public String sound() {
        return "meow";
    }

}
