package com.gamasoft.tree;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

value public class Branch implements Node {

    final public Node parent;
    final public Set<Integer> values = new HashSet<Integer>();

    public Branch(Node parent, Set<Integer> values) {
        this.parent = parent;
        this.values.addAll(values);
    }

    @Override
    public String walkToRoot() {
//        return "Branch ["
//                + values.stream().map(String::valueOf).collect(Collectors.joining(","))
//                + "] "
//                + parent.walkToRoot();
        return "Branch ["
                + values.stream().map(x -> x.toString()).collect(Collectors.joining(","))
                + "] "
                + parent.walkToRoot();

    }
}
