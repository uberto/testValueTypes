package com.gamasoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        var p = Point.of(5,5);
        var p2 = new Point(5,5);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p.equals(p2));
    }
}
