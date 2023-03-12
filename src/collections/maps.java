package collections;

import java.util.*;

public class maps {
    public static void main(String[] args) {
        System.out.println("Hello Maps!");

        // creating
        Map<String, String> myHashMap = new HashMap<>();
        Map<String, String> myLinkedHasMap = new LinkedHashMap<>();  // preserves insertion or access order
        Map<String, String> myTreeMap = new TreeMap<>();  // allows ordering
        myHashMap.put("I", "eu");
        myHashMap.put("nothing", "nada");

        Integer size = myHashMap.size();

        // inserting
        String[] wordsEng = {"this", "is", "a", "test"};
        String[] wordsPt = {"isto", "eh", "um", "teste"};
        for (int i = 0; i < wordsEng.length; i++) {
            myHashMap.put(wordsEng[i], wordsPt[i]);
        }
        size = myHashMap.size();

        // TODO: move from myHashMap to myTreeMap

        // accessing the map
        for (int i = 0; i < wordsEng.length; i++) {
            String t = myHashMap.get(wordsEng[i]);  // gets the value corresponding to that key
            System.out.println(t);
        }

        boolean result1 = myHashMap.containsKey(wordsEng[0]);  // true
        boolean result2 = myHashMap.containsKey(wordsEng[0].toUpperCase());  // false
        boolean result3 = myHashMap.containsValue("isto");  // true

        Set<String> keys = myHashMap.keySet();
        Collection<String> values = myHashMap.values();
        Set<Map.Entry<String,String>> entries = myHashMap.entrySet();
        System.out.printf("Map: %s%nKeys: %s%nValues: %s%nEntries: %s%n",
                            myHashMap, keys, values, entries);

        for(String key : myHashMap.keySet()) {
            String k = key;
           System.out.println(k);
        }
        for(String value : myHashMap.values()) {
            String v = value;
           System.out.println(v);
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

    }
}
