package com.gamasoft;

public class Main {

//reference:
//http://cr.openjdk.java.net/~fparain/L-world/L-World-JVMS-4f.pdf
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types+Command-line+Options


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        var p = Point.of(5,5);
        var p1 = Point.of(5,5);
        var p2 = new Point(5,5);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p.equals(p2));
    }
}
