package com.ubertob.aggregates;

inline public class User {

    private final SixteenCharString name;
    private final SixteenCharString surname;

    public User(String name, String surname) {
        this.name = new SixteenCharString(name);
        this.surname = new SixteenCharString(surname);
    }

    public String getName(){
        return name.getValue();
    }

    public String getSurname(){
        return surname.getValue();
    }


}