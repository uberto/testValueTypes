package com.ubertob.aggregates;

import java.util.Arrays;


inline public class User {
    public final char c0;
    public final char c1;
    public final char c2;
    public final char c3;
    public final char c4;
    public final char c5;
    public final char c6;
    public final char c7;
    public final char c8;
    public final char c9;
    public final char cA;
    public final char cB;
    public final char cC;
    public final char cD;
    public final char cE;
    public final char cF;
    public final int yearOfBirth;

    public User(String name, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;

        char[] padded = (name + "                ").substring(0, 16).toCharArray();
        int index =0;
        c0 = padded[index++];
        c1 = padded[index++];
        c2 = padded[index++];
        c3 = padded[index++];
        c4 = padded[index++];
        c5 = padded[index++];
        c6 = padded[index++];
        c7 = padded[index++];
        c8 = padded[index++];
        c9 = padded[index++];
        cA = padded[index++];
        cB = padded[index++];
        cC = padded[index++];
        cD = padded[index++];
        cE = padded[index++];
        cF = padded[index++];

    }

    public String getName(){
        StringBuilder sb = new StringBuilder()
                .append(c0)
                .append(c1)
                .append(c2)
                .append(c3)
                .append(c4)
                .append(c5)
                .append(c6)
                .append(c7)
                .append(c8)
                .append(c9)
                .append(cA)
                .append(cB)
                .append(cC)
                .append(cD)
                .append(cE)
                .append(cF);
        return sb.toString().trim();
    }

}