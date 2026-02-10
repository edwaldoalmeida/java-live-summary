package com.edwaldoalmeida.javalivesummary.collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        System.out.println("Hello Maps!");

        // creating
        Map<String, String> myHashMap = new HashMap<>();
        // Map<String, String> myLinkedHasMap = new LinkedHashMap<>();  // preserves insertion or access order

        // inserting one-by-one
        myHashMap.put("I", "eu");
        myHashMap.put("nothing", "nada");

        myHashMap.put("I", "Eu"); // updates the key with I

        Integer size = myHashMap.size();
        System.out.println("Current size: " + size);

        // inserting from lists
        String[] wordsEnglish = {"this", "is", "a", "test"};
        String[] wordsPortuguese = {"isto", "eh", "um", "teste"};
        for (int i = 0; i < wordsEnglish.length; i++) {
            myHashMap.put(wordsEnglish[i], wordsPortuguese[i]);
        }
        size = myHashMap.size();
        System.out.println("New size: " + size);

        // iterating / accessing the map (regular/old method)
        for (int i = 0; i < wordsEnglish.length; i++) {
            String wordPortuguese = myHashMap.get(wordsEnglish[i]);  // gets the value corresponding to that key
            System.out.println("English word: " + wordsEnglish[i] + ", Portuguese word: " + wordPortuguese);
        }
        // iterating / accessing the map (like Python's 'for')
        for(String key : myHashMap.keySet()) {
            System.out.println(key);
        }
        for(String value : myHashMap.values()) {
            System.out.println(value);
        }
        // the way to search for a value to get its key
        for(Map.Entry<String,String> pair : myHashMap.entrySet()) {
            String k = pair.getKey();
            String v = pair.getValue();
            System.out.printf("%s ==> %s%n", k, v);
        }

        // checking if a key or value exist
        boolean containsLowercaseThis = myHashMap.containsKey("this");  // true
        boolean containsUppercaseThis = myHashMap.containsKey("THIS");  // false
        boolean containsIstoValue = myHashMap.containsValue("isto");  // true

        // creating another data structures with the Map content
        Set<String> keys = myHashMap.keySet(); // `keys` will point to myHashMap
        Collection<String> values = myHashMap.values(); // `values` will point to myHashMap
        Set<Map.Entry<String,String>> entries = myHashMap.entrySet(); // `entries` will point to myHashMap
        System.out.printf("Map: %s%nKeys: %s%nValues: %s%nEntries: %s%n",
                myHashMap, keys, values, entries);

        // deleting
        myHashMap.remove("nothing");  // by key
        myHashMap.keySet().retainAll(Arrays.asList("this", "is", "a", "test"));  // by key
        myHashMap.values().remove("um");  // by value
        myHashMap.values().retainAll(Arrays.asList("isto", "eh"));  // by value
        boolean isEmpty = myHashMap.isEmpty();  // false
        myHashMap.clear();
        isEmpty = myHashMap.isEmpty();  // true


        // creating a TreeMap (allows ordering)
        Map<String, Integer> myTreeMap = new TreeMap<>();

        // inserting data
        String[] tNames = {"one", "two", "three", "four"};
        Integer[] tNumbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < tNames.length; i++) {
            myTreeMap.put(tNames[i], tNumbers[i]);
        }

        // iterating (using Iterators)
        Iterator<Map.Entry<String, Integer>> iterator = myTreeMap.entrySet().iterator();
        Map.Entry<String, Integer> iAmHere = iterator.next();
        Map.Entry<String, Integer> youAreTheNextOne = iterator.next();


    }
}
