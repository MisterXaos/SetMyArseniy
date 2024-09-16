package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberExtractor {
    public Set<Integer> extractUniqueNumbers(List<Integer> numbers){
        return new HashSet<>(numbers);
    }
}
