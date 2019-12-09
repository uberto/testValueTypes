package com.ubertob;

import static com.ubertob.examples.MiniStringTrades.generatingTradesAndBrowing;

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

    public static void main(String[] args) {

//        BrowseTree.recursiveCalls();
//
//        System.out.println("\n\nNormal class Shark " + Metadata.extractClassMetadata(Shark.class));
//        System.out.println("\n\nInline Type Cat " + Metadata.extractClassMetadata(Cat.class));
//
////        Cat? maybeCat = null;
////        System.out.println("\n\nInline Type Cat? " + Metadata.extractClassMetadata(maybeCat.class));
//
//        FlattenArrays.equalityAndToString();
//
//        FlattenArrays.boxesAndNullability();
//
//        FlattenArrays.flattenedArray();
//
//        Generics.wrappingInlined();
//
//        FlattenedStrings.userMemorySize();


        generatingTradesAndBrowing();

    }


}
