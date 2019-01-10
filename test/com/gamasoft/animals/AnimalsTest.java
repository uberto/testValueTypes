package com.gamasoft.animals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnimalsTest {

    @Test
    public void collectionsTest() {
        var d = new Dog("Lassie"); //VT
        var c = new Cat("Ginger"); //VT
        var s = new Shark(); //Object

        List<Animal> animalList = new ArrayList<>();
        animalList.add(d);
        animalList.add(c);
        animalList.add(s);

        System.out.println(animalList);
        animalList.forEach(x -> System.out.println(" sound " + x.sound()));

     //   System.out.println(c.isValue());

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



}
