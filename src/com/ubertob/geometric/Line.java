package com.ubertob.geometric;

public inline class Line {
//    public __Flattenable final Point startPoint;
//    public __Flattenable final Point endPoint;
    //__Flattenable: This modifier is allowed only with -XDallowFlattenabilityModifiers
    public final Point startPoint;
    public final Point endPoint;
    //__Flattenable not needed in LW2 ?

    public Line(Point p1, Point p2) {
        this.startPoint = p1;
        this.endPoint = p2;
    }

    public double calculateLength(){
        var dx = startPoint.x - endPoint.x;
        var dy = startPoint.y - endPoint.y;

        return Math.sqrt(dx*dx+dy*dy);
    }


}
