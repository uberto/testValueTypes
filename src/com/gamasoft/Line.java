package com.gamasoft;

public value class Line {
    public __Flattenable final Point startPoint;
    public __Flattenable final Point endPoint;

    public Line(Point p1, Point p2) {
        this.startPoint = p1;
        this.endPoint = p2;
    }

    public double calculateLength(){
        var dx = startPoint.x - endPoint.x;
        var dy = startPoint.y - endPoint.y;

        return Math.sqrt(dx*dx+dy*dy);
    }
    //__Flattenable: This modifier is allowed only with -XDallowFlattenabilityModifiers
}
