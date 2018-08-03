package com.gamasoft;


final __ByValue class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point that) {
        return this.x == that.x && this.y == that.y;
    }

    private Point() {
        this.x =  0;
        this.y =  0;
    }

    public static Point of(int x, int y) {
        Point v = __MakeDefault Point();
        v = __WithField(v.x, x);
        v = __WithField(v.y, y);
        return v;
    }


    static Point origin = of(0, 0);
//    static Point origin = __MakeValue(0, 0);
    static String stringValueOf(Point p) {
        return "Point("+p.x+","+p.y+")";
    }
    static Point displace(Point p, int dx, int dy) {
        if (dx == 0 && dy == 0)
            return p;
        Point p2 = of(p.x + dx, p.y + dy);
        assert(!p.equals(p2));
        return p2;
    }

//    public __Flattenable final Value1 value;

}
