package com.ubertob.aggregates;

inline public class User {

    public final int yearOfBirth;

    private final SixteenCharString name;

    public User(String name, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.name = new SixteenCharString(name);
    }

    public String getName(){
        return name.getValue();
    }



}