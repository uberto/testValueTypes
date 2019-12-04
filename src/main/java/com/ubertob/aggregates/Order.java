package com.ubertob.aggregates;

import java.util.Arrays;

inline public class Order {
    public final String id;
    public final OrderedItem[] items; //not flattened

    public Order(String id, OrderedItem[] items) {
        this.id = id;
        this.items = items;
    }

    public double getTotalAmount(){
        return Arrays.stream(items).map(i -> i.price * i.quantity).reduce(Double::sum).orElse(0.0);
    }
}



