package com.ubertob;

import com.ubertob.tree.Branch;
import com.ubertob.tree.Root;

import java.util.*;

public class Main {

//reference:
//http://cr.openjdk.java.net/~fparain/L-world/L-World-JVMS-4f.pdf
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types
//https://wiki.openjdk.java.net/display/valhalla/L-World+Value+Types+Command-line+Options
//https://wiki.openjdk.java.net/display/valhalla/LW2
//https://mail.openjdk.java.net/pipermail/valhalla-spec-experts/2019-July/001091.html

//You need to compile with javac -XDallowGenericsOverValues flag

//Error:(3, 15) java: cannot access java.lang.invoke.ValueBootstrapMethods
//  class file for java.lang.invoke.ValueBootstrapMethods not found
//you need source =14



//    Error:IntelliLang Pattern Validator: Error: java.lang.IllegalArgumentException
//    java.lang.IllegalArgumentException
//    at org.jetbrains.org.objectweb.asm.Type.getTypeInternal(Type.java:440)
    //fix: -Dcompiler.process.jdk=/home/ubertobarbini/jvm/jdk-14-valhalla
//
//    Error:IntelliLang Pattern Validator: Error: java.lang.IllegalArgumentException
//    java.lang.IllegalArgumentException
//    at org.jetbrains.org.objectweb.asm.Type.getTypeInternal(Type.java:440)
//fix ??

    public static void main(String[] args) {

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


}
