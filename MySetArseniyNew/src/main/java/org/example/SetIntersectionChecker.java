package org.example;

import java.util.Set;

public class SetIntersectionChecker {
    public boolean isIntersecting(Set<Integer> set1, Set<Integer> set2) {
        boolean a =false;
        if(set1.size() == set2.size() && set1.size() ==0){
            a =true;
        }else{
            for (Integer number : set1) {
                if (set2.contains(number)) {
                    a = true;
                }
            }
        }
        return a;
    }
}
