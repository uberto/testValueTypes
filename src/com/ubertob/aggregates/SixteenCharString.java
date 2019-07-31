package com.ubertob.aggregates;

inline public class SixteenCharString {
    private final char c0;
    private final char c1;
    private final char c2;
    private final char c3;
    private final char c4;
    private final char c5;
    private final char c6;
    private final char c7;
    private final char c8;
    private final char c9;
    private final char cA;
    private final char cB;
    private final char cC;
    private final char cD;
    private final char cE;
    private final char cF;

    public SixteenCharString(String value){
        char[] padded = (value + "                ").toCharArray();
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

    public String getValue(){
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
