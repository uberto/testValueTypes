package com.ubertob.examples;

import com.ubertob.generics.Wrapper;

import java.util.function.Function;

public class Generics {

    public static void wrappingInlined(){
        var ws = new Wrapper<String>("hello");
        var wi = new Wrapper<Integer>(25);
//        var oii = new Outcome<int>(25); still not compiling

        System.out.println("Outcome String " + ws.toString());
        System.out.println("Outcome Integer " + wi.toString());

        var nw = ws.map(s -> s.length());
        System.out.println("Mapped Outcome " + nw.toString());

        var wf = new Wrapper<Function<String, Boolean>>((String s) -> s.isEmpty() || s.isBlank());

        System.out.println("Lambda Outcome " + wf.toString());

    }
}
