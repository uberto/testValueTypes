package com.gamasoft.animals;

public class Alsatian implements Animal  {
    // extends Dog
    // Error: value type may not extend another value or class
    // Error: cannot inherit from final com.gamasoft.animals.Dog
    private final String name;

    public Alsatian(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name();
    }

    @Override
    public String sound() {
        return "Bau";
    }
}
