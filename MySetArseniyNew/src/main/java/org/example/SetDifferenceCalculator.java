package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetDifferenceCalculator {
    public Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set_res = new HashSet<>(set1);
        set_res.removeAll(set2) ;
        return set_res;
    }
}
