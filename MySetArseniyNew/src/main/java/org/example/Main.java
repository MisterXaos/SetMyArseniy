package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final Set<Integer> numbers;

    public static void main(String[] args) {
        System.out.println(numbers);
    }

    static {
        numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

    }
}