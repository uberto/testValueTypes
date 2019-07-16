package com.ubertob;

import com.ubertob.animals.Cat;
import com.ubertob.examples.BrowseTree;
import com.ubertob.examples.Metadata;
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

        BrowseTree.recursiveCalls();


        System.out.println("\n\nInline Type Cat " + Metadata.extractClassMetadata(Cat.class));
        System.out.println("\n\nNormal class Shark " + Metadata.extractClassMetadata(Cat.class));
    }


}
