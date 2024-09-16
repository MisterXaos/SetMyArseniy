package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetMerger {
    public Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> set_all = new HashSet<>(set1);
        set_all.addAll(set2);
        return set_all;
    }

}
