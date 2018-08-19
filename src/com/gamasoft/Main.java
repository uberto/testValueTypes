package com.gamasoft;

import com.gamasoft.animals.Animal;
import com.gamasoft.animals.Cat;
import com.gamasoft.animals.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

//reference:
//http://cr.openjdk.java.net/~fparain/L-world/L-World-JVMS-4f.pdf
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types+Command-line+Options


//You need to compile with javac -XDallowGenericsOverValues flag


    public static void main(String[] args) {

        pointTest();

        animalTest();
    }

    private static void animalTest() {
        var d = new Dog("Lassie");
        var c = new Cat("Ginger");
        var s = new Shark();

//        List<Dog> dogList = new ArrayList<>(); don't compile
//        dogList.add(d);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(d);
        animalList.add(c);
        animalList.add(s);

        System.out.println(animalList);
        animalList.forEach(x -> System.out.println(" sound " + x.sound()));

//        System.out.println(c.isValue());

        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(d);
        animalSet.add(c);
        animalSet.add(s);

        System.out.println(animalSet);


        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat("Tom"));
        catSet.add(new Cat("Jerry"));
        catSet.add(new Cat("Silvester"));

        System.out.println(catSet);
    }

    private static void pointTest() {
        var p1 = Point.of(5,5);
        var p2 = new Point(5,5); //it calls MakeValue
//        p2.x = 6   //doesn't compile
        var p3 = Point.displace(p1, 2,-2);
        var p4 = p1.displace(2,-2);


        System.out.println(p1); //[value class com.gamasoft.Point, 5, 5]
        System.out.println(p2); //[value class com.gamasoft.Point, 5, 5]
        System.out.println(p3); //[value class com.gamasoft.Point, 7, 3]
        System.out.println(p1.equals(p2)); //true
//        System.out.println(p == p1);  //doesn't compile
        System.out.println(p1.equals(p3)); //false
        System.out.println(p1.desc("my message")); //my message x:5 y:5 ???
        System.out.println(p4.equals(p3)); //true


    }


}
