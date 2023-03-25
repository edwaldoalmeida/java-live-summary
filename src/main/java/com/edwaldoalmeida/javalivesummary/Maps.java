package com.edwaldoalmeida.javalivesummary;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        System.out.println("Hello Maps!");

        // creating
        Map<String, String> myHashMap = new HashMap<>();
        Map<String, String> myLinkedHasMap = new LinkedHashMap<>();  // preserves insertion or access order

        // inserting one-by-one
        myHashMap.put("I", "eu");
        myHashMap.put("nothing", "nada");

        Integer size = myHashMap.size();

        // inserting from lists
        String[] wordsEng = {"this", "is", "a", "test"};
        String[] wordsPt = {"isto", "eh", "um", "teste"};
        for (int i = 0; i < wordsEng.length; i++) {
            myHashMap.put(wordsEng[i], wordsPt[i]);
        }
        size = myHashMap.size();

        // iterating / accessing the map (regular/old method)
        for (int i = 0; i < wordsEng.length; i++) {
            String t = myHashMap.get(wordsEng[i]);  // gets the value corresponding to that key
            System.out.println(t);
        }

        // checking if a key or value exist
        boolean result1 = myHashMap.containsKey(wordsEng[0]);  // true
        boolean result2 = myHashMap.containsKey(wordsEng[0].toUpperCase());  // false
        boolean result3 = myHashMap.containsValue("isto");  // true

        // creating another datastructures with the Map content
        Set<String> keys = myHashMap.keySet();
        Collection<String> values = myHashMap.values();
        Set<Map.Entry<String,String>> entries = myHashMap.entrySet();
        System.out.printf("Map: %s%nKeys: %s%nValues: %s%nEntries: %s%n",
                myHashMap, keys, values, entries);

        // iterating / accessing the map (like Python's 'for')
        for(String key : myHashMap.keySet()) {
            // String k = key;
            System.out.println(key);
        }
        for(String value : myHashMap.values()) {
            // String v = value;
            System.out.println(value);
        }
        for(Map.Entry<String,String> pair : myHashMap.entrySet()) {
            String k = pair.getKey();
            String v = pair.getValue();
            System.out.printf("'%s' ==> %s%n", k, v);
        }

        // deleting
        myHashMap.remove("nothing");  // by key
        myHashMap.keySet().retainAll(Arrays.asList("this", "is", "a", "test"));  // by key
        myHashMap.values().remove("um");  // by value
        myHashMap.values().retainAll(Arrays.asList("isto", "eh"));  // by value
        boolean isEmpty = myHashMap.isEmpty();  // false
        myHashMap.clear();
        isEmpty = myHashMap.isEmpty();  // true

        // creating a TreeMap
        Map<String, Integer> myTreeMap = new TreeMap<>();  // allows ordering

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
