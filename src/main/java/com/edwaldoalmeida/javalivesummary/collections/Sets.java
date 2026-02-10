package com.edwaldoalmeida.javalivesummary.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Sets {
    public static void main(String[] args) {
        System.out.println("Hello Sets!");

        // A Set is an unordered collection that (unlike List) is guaranteed to not contain any duplicate values.
        // it is  unmodifiable (no add/remove)
        Set<Integer> integers = Set.of(1,2,3);
        Set<String> strings = Set.of("string1", "string2", "string3");
        Set<Object> mixed = Set.of(1, "string");

        // To create a modifiable Set, you need to instantiate a class that implements the Set interface.
        // The most-used built-in class that implements this interface is the HashSet class.
        Set<Integer> set = new HashSet<>();
        boolean result1 = set.add(1); // returns true
        boolean result2 = set.add(2); // returns true
        boolean result3 = set.add(1); // returns false
        set.size(); // 2
        set.contains(1); // true
        set.contains(3); // false
        set.remove(3); // returns false
        set.remove(2); // returns true
        set.size(); // 1

        // adding the whole list to the Set
        List<Integer> myList = List.of(4,5,6);
        set.addAll(myList);



        System.exit(1);
    }
}
