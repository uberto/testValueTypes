package com.gamasoft.animals;

public class Alsatian implements Animal  {// extends Dog doesn't compile
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
