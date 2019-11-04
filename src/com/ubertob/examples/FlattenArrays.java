package com.ubertob.examples;


import com.ubertob.animals.Cat;
import com.ubertob.animals.Dog;
import com.ubertob.generics.Wrapper;
import com.ubertob.geometric.*;

import java.util.ArrayList;
import java.util.Date;

public class FlattenArrays {


    public static void equalityAndToString() {
        {
            var c1 = new Cat("tom");
            var c2 = new Cat("tom");

            System.out.println("\nCat to String " + c1.toString());  //[com.ubertob.animals.Cat name=tom]
            System.out.println("Cat == equality " + (c1 == c2));
        }

        {
            var c1 = new CoordInlined(3, 4);
            var c2 = CoordInlined.of(3, 4);

            System.out.println("\nCoord to String " + c1.toString());  //
            System.out.println("Coord == equality " + (c1 == c2));
        }


        {
            var p1 = new Point(3, 4);
            var p2 = Point.of(3, 4);

            System.out.println("\nPoint to String " + p1.toString());  //
            System.out.println("Point == equality " + (p1 == p2));
        }

    }


    public static void flattenedArray() {

        {
            var memBefore = Runtime.getRuntime().freeMemory();
            var values = new CoordNotInlined[1_000_000];
            var memUsed = memBefore - Runtime.getRuntime().freeMemory();
            System.out.println("\nMemory for 1M Coords " + memUsed); //4MB  (just pointers)
            System.out.println("Coord default " + values[0]); //0,0
        }

        {
            var memBefore = Runtime.getRuntime().freeMemory();
            var values = new CoordInlined[1_000_000];
            var memUsed = memBefore - Runtime.getRuntime().freeMemory();
            System.out.println("\nMemory for 1M InlineCoord " + memUsed); //8MB (flattened)
            System.out.println("InlineCoord default " + values[0]); //0,0
        }

        {
            var linesmemBefore = Runtime.getRuntime().freeMemory();
            var lines = new Line[1_000_000];
            var linesmemUsed = linesmemBefore - Runtime.getRuntime().freeMemory();
            System.out.println("\nMemory for 1M Lines " + linesmemUsed); //16MB (flattened)
            System.out.println("Line default " + lines[0]);
        }

        {
            var memBefore = Runtime.getRuntime().freeMemory();
            var values = new PaletteColor[1_000_000];
            var memUsed = memBefore - Runtime.getRuntime().freeMemory();
            System.out.println("\nMemory for 1M PaletteColor " + memUsed); //~1MB 1048576 1000016
            System.out.println("PaletteColor default " + values[0]);
        }

        {
            var memBefore = Runtime.getRuntime().freeMemory();
            var lines = new Wrapper[1_000_000];
            var memUsed = memBefore - Runtime.getRuntime().freeMemory();
            System.out.println("\nMemory for 1M Outcome " + memUsed); //4MB (flattened)
            System.out.println("Outcome default " + lines[0]);

            lines[1] = new Wrapper("pippo");
            lines[2] = new Wrapper(123);
            lines[3] = new Wrapper(new Date());
            lines[4] = new Wrapper(new CoordInlined(3, 4));
        }
    }


    public static void boxesAndNullability() {
        var nullableCats = new NullableCats(); //inline types can be used as nullable with ?
        nullableCats.add(new Cat("another cat"));
        nullableCats.add(null); //ok

        System.out.printf("You can add a null to an array of Boxed value");


        var notNullableDogs = new ArrayList<Dog>(); //inline types cannot be used as nullable without ?
        notNullableDogs.add(new Dog("another dog"));
//            notNullableDogs.add(null); //Compile Error: incompatible types: <nulltype> cannot be converted to Dog
    }

}
