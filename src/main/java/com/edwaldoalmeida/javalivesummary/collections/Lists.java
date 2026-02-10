package com.edwaldoalmeida.javalivesummary.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        System.out.println("Hello Lists!");

        // Immutable
        List<String> emptyList = List.of();
        List<Integer> singleInteger = List.of(1);
        List<Boolean> threeBooleans = List.of(true,false,true);
        List<Object> listWithMultipleTypes = List.of("String", 1, true);
        // why can't do .add() ???


        // creating the list
        // List that accepts any type of object
//        List myList = new ArrayList();

        // List with strong typing (avoids runtime errors by not allowing different object types in the same list)
//        List<String> myList = new ArrayList<String>();
//        myList.add("test1");
//        myList.add("test2");
//        myList.add("test3");
//        myList.add("test4");
//        myList.add("test5");
//        myList.add("test6");
//        myList.add("test7");

        // Same list with strong typing, but initializing list on creation
        List<String> myList = new ArrayList<String>(Arrays.asList("test1", "test2", "test3", "test4", "test5", "test6", "test7"));

        // appending items at the end of the list
        myList.add("test8");
        myList.add("test9");
        myList.add("test10");
        int listSize = myList.size();
        System.out.println("This is the list: " + myList);
        System.out.println("This is the 2nd element: " + myList.get(1));
        System.out.println("This is the last element: " + myList.get(listSize - 1));
        
        boolean containTest10 = myList.contains("test10");
        System.out.println("This list contains an element 'test10'? " + containTest10);

        String firstContent = myList.get(0);

        // iterating over the list (enhanced 'for')
        // only possible in strong typed ArrayLists
        for (String word : myList) {  // Python: `for word in myList:`
            System.out.println("This is one of the list items: " + word);
        }

        // iterating over the list (old way)
        for (int i = 0; i < listSize; i++) {
            System.out.println("This is one of the list items (again): " + myList.get(i));
        }

        // selecting part of the list (`note`: lastIndex not included!)
        int centerOfTheList = myList.size()/2;
        int nextElement = centerOfTheList + 1;

        // creating a sublist
        List<String> subList = myList.subList(centerOfTheList, nextElement + 1); // lastIndex not included!

        // removing element by index
        myList.remove(0);

        // removing element "by content" ?
        myList.remove("test5");

        // remove a collection of items at once
        List<String> wordsToBeRemoved = Arrays.asList("test8", "test9");
        myList.removeAll(wordsToBeRemoved);

        // remove all _but_ a collection items
        List<String> wordsToKeep = Arrays.asList("test2", "test3");
        myList.retainAll(wordsToKeep);

        // removes everything from the list
        myList.clear();

        // adding element after cleaning the list
        myList.add("test100");

    }
}
