package com.ubertob.aggregates;

inline

public class User {

    private EnumTypes type;
    private SixteenCharString name;
    private SixteenCharString surname;

    public User(String name, String surname) {
        this.name = new SixteenCharString(name);
        this.surname = new SixteenCharString(surname);
        type = EnumTypes.ONE;
    }

    public String getName() {
        return name.getValue();
    }

    public String getSurname() {
//        name = new SixteenCharString(surname.getValue());  //even without final is not allowed to change
        return surname.getValue();
    }


}