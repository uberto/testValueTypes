package com.ubertob.geometric;

 inline public class Line {

    public final CoordInlined startPoint;
    public final CoordInlined endPoint;

    public Line(CoordInlined p1, CoordInlined p2) {
        this.startPoint = p1;
        this.endPoint = p2;
    }

    public double calculateLength(){
        var dx = startPoint.x - endPoint.x;
        var dy = startPoint.y - endPoint.y;

        return Math.sqrt(dx*dx+dy*dy);
    }


}
