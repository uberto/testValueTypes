package com.ubertob.generics;

import java.util.function.Function;

inline public class Wrapper<T> {

    private final T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public <U> Wrapper<U> map(Function<T, U> f){
        return new Wrapper<>(f.apply(value));
    }

    //doesn't compile error: unexpected type
//    public Wrapper<T> flatMap(Function<T, Wrapper<T>> f){
//        return f.apply(value);
//    }

}
