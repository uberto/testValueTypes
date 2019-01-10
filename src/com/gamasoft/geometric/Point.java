package com.gamasoft.geometric;


public final value class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        Point p = Point.default;
        Point p1 = __WithField(p.x, x); //WithField operator is allowed only with -XDallowWithFieldOperator
        Point p2 = __WithField(p1.y, y);
        return p2;
    }

//    public boolean equals(Point that) {
//        return this.x == that.x && this.y == that.y;
//    }

    public String desc(String msg) {
        return msg + " x:" + x + " y:" + y;
    }

    private Point() {
        this.x =  0;
        this.y =  0;
    }
    public static Point origin = new Point(0, 0);

    public static String stringValueOf(Point p) {
        return "Point("+p.x+","+p.y+")";
    }
    public static Point displace(Point p, int dx, int dy) {
        if (dx == 0 && dy == 0)
            return p;

        Point p2 = new Point(p.x + dx, p.y + dy);
        return p2;
    }

    public Point displace(int dx, int dy) {
        return Point.displace(this, dx, dy);
    }


}
