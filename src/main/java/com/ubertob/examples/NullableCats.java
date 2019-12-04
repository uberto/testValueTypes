package com.ubertob.examples;

import com.ubertob.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class NullableCats {
    public final List<Cat?> cats = new ArrayList<Cat?>();

    void add(Cat? anotherCat) {
        cats.add(anotherCat);
    }

    void addNN(Cat anotherCat) {
        cats.add(anotherCat);
    }


}
