package com.ubertob.geometric;

inline public class CoordInlined {

    public final int x;
    public final int y;

    public CoordInlined(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public static CoordInlined origin = new CoordInlined(0, 0);  SEGFAULT

    public static CoordInlined origin() {
        return new CoordInlined(0, 0);
    }


    public static CoordInlined of(int x, int y) {
        CoordInlined c = CoordInlined.default;
        CoordInlined c1 = __WithField(c.x, x); //WithField operator is allowed only with -XDallowWithFieldOperator
        CoordInlined c2 = __WithField(c1.y, y);
        return c2;
    }

}
