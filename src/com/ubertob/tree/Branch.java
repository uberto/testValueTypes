package com.ubertob.tree;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

 inline public class Branch implements Node {

    final public Node parent;
    final public Set<Integer> values = new HashSet<Integer>();

    public Branch(Node parent, Set<Integer> values) {
        this.parent = parent;
        this.values.addAll(values);
    }

    @Override
    public String walkToRoot() {
        return "Branch ["
                + values.stream().map(Object::toString).collect(Collectors.joining(","))
                + "] "
                + parent.walkToRoot();

    }
}
