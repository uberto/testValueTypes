package ubertob.animals;

import com.ubertob.animals.Animal;
import com.ubertob.animals.Cat;
import com.ubertob.animals.Dog;
import com.ubertob.animals.Shark;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {

    @Test
    public void collectionsTest() {
        var d = new Dog("Lassie"); //VT
        var c = new Cat("Ginger"); //VT
        var s = new Shark(); //Object

        c.defMethod();

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

    @Test
    public void locks(){

        var d = new Dog("Lassie"); //VT
        var s = new Shark(); //Object

 //       d.notify(); //Error: value types do not support notify

        lockedMethod(s);

        try {
            lockedMethod(d); //Runtime error
//        java.lang.IllegalMonitorStateException: com.ubertob.animals.Dog

        } catch (IllegalMonitorStateException e) {
            assertEquals("com.ubertob.animals.Dog", e.getMessage());
        }
    }

    private void lockedMethod(Object toBeLockedOn){

        System.out.println("Start locking");
        synchronized (toBeLockedOn){

            System.out.println("locked on " + toBeLockedOn);

        }
        System.out.println("Released locking");

    }


}
