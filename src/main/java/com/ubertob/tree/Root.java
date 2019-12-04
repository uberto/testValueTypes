package com.ubertob.tree;

inline public class Root implements Node {

   final private String name = "root"; //does not compile without a field

    @Override
    public String walkToRoot() {
        return "Root " + name;
    }
}
