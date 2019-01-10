package com.gamasoft.geometric;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



class PointTest {

    private Point[] createArray() {
        Point[] values = new Point[1000];
        for (int i = 0, k = 0; i < values.length; i++, k += 2) {
            values[i] = new Point(k, k + 1);
        }
        return values;
    }

    @Test
    void testConstructors(){

        Point p1 = new Point(3,4);

        Point p2 = Point.of(3, 4);
        //        p2.x = 6   //doesn't compile

        assertEquals(p1, p2);
    }

    @Test
    void testToString(){
        var p1 = new Point(5,5);
        var p2 = new Point(5,5); //it calls MakeValue
        var p3 = Point.displace(p1, 2,-2);
        var p4 = p1.displace(2,-2);


        assertEquals("[value class com.gamasoft.geometric.Point, 5, 5]", p1.toString());
        System.out.println(p2); //[value class com.gamasoft.geometric.Point, 5, 5]
        System.out.println(p3); //[value class com.gamasoft.geometric.Point, 7, 3]


    }


    @Test
    void testGenerics(){

        var list = new ArrayList<Point>();
        list.add(Point.of(3, 4));
//        list.add(null); //Error: incompatible types: <nulltype> cannot be converted to com.gamasoft.geometric.Point

        assertEquals(1, list.size());
        assertEquals(new Point(3, 4), list.get(0));
//        assertEquals(null, list.get(1));

    }


    @Test
    void testArrayTest(){

        var points = createArray();
        System.out.println(points);
        System.out.println(points[0]);

        assertEquals(1000, points.length);

    }


    @Test
    void testEquality(){

        var p1 = new Point(3, 4);
        var p2 = new Point(4, 5);
        var p3 = p1.displace(1,1);

        assertEquals(p2, p3);
    //    assertTrue(p2 == p3); //Error: value types do not support ==
    }

    @Test
    void testArrayMemory(){

        var memBefore = Runtime.getRuntime().freeMemory();
        var values = new Line[1_000_000];
        var memUsed = memBefore - Runtime.getRuntime().freeMemory();
        System.out.println("Memory for 1M Points " + memUsed); //8MB
        System.out.println("Point default " + values[0]); //0,0

    }

    @Test
    void testFlattenMemory(){

        var memBefore = Runtime.getRuntime().freeMemory();
        var values = new Line[1_000_000];
        var memUsed = memBefore - Runtime.getRuntime().freeMemory();
        System.out.println("Memory for 1M Lines " + memUsed); //16MB

    }




}