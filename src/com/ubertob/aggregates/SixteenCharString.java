package com.ubertob.aggregates;

inline public class SixteenCharString {
    private final byte c0;
    private final byte c1;
    private final byte c2;
    private final byte c3;
    private final byte c4;
    private final byte c5;
    private final byte c6;
    private final byte c7;
    private final byte c8;
    private final byte c9;
    private final byte cA;
    private final byte cB;
    private final byte cC;
    private final byte cD;
    private final byte cE;
    private final byte cF;

    public SixteenCharString(String value){
        char[] padded = (value + "                ").toCharArray();
        int index =0;
        c0 = (byte) padded[index++];
        c1 = (byte) padded[index++];
        c2 = (byte) padded[index++];
        c3 = (byte) padded[index++];
        c4 = (byte) padded[index++];
        c5 = (byte) padded[index++];
        c6 = (byte) padded[index++];
        c7 = (byte) padded[index++];
        c8 = (byte) padded[index++];
        c9 = (byte) padded[index++];
        cA = (byte) padded[index++];
        cB = (byte) padded[index++];
        cC = (byte) padded[index++];
        cD = (byte) padded[index++];
        cE = (byte) padded[index++];
        cF = (byte) padded[index++];
    }

    public String getValue(){
        char[] padded = new char[16];
        int index =0;
        padded[index++] = (char) c0;
        padded[index++] = (char) c1;
        padded[index++] = (char) c2;
        padded[index++] = (char) c3;
        padded[index++] = (char) c4;
        padded[index++] = (char) c5;
        padded[index++] = (char) c6;
        padded[index++] = (char) c7;
        padded[index++] = (char) c8;
        padded[index++] = (char) c9;
        padded[index++] = (char) cA;
        padded[index++] = (char) cB;
        padded[index++] = (char) cC;
        padded[index++] = (char) cD;
        padded[index++] = (char) cE;
        padded[index++] = (char) cF;
        return new String(padded).trim();
    }
}
