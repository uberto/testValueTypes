package com.gamasoft;

import com.gamasoft.animals.Animal;
import com.gamasoft.animals.Cat;
import com.gamasoft.animals.Dog;
import com.gamasoft.tree.Branch;
import com.gamasoft.tree.Root;

import java.util.*;

public class Main {

//reference:
//http://cr.openjdk.java.net/~fparain/L-world/L-World-JVMS-4f.pdf
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types+Command-line+Options


//You need to compile with javac -XDallowGenericsOverValues flag


    public static void main(String[] args) {

        pointTest();

        animalTest();

        treeTest();
    }

    private static void treeTest() {
        Root r = new Root();
        Branch b1 = new Branch(r, Collections.emptySet());
        Branch b2 = new Branch(r, Set.of(1,2,3));
        Branch b11 = new Branch(b1, Set.of(10,11));
        Branch b21 = new Branch(b2, Set.of(20,21));
        Branch b31 = new Branch(b21, Set.of(100, 101));


        System.out.println(b31.walkToRoot());

        b21.values.add(1000);

        System.out.println(b21.walkToRoot());

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
        var p1 = new Point(5,5);
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
