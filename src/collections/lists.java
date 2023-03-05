package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        System.out.println("Hello Lists!");

        // creating the list
        // List<String> l = new ArrayList<>();
        List<String> l = new ArrayList<>(Arrays.asList("test1", "test2", "test3", "test4", "test5", "test6", "test7"));

        // appending items at the end of the list
        l.add("test8");
        l.add("test9");
        l.add("test10");
        int listSize = l.size();
        System.out.println("This is the list: " + l);
        System.out.println("This is the 2nd element: " + l.get(1));
        System.out.println("This is the last element: " + l.get(listSize - 1));

        // iterating over the list (enhanced 'for')
        for (String word : l) {  // Python: `for word in l:`
            System.out.println("This is one of the list items: " + word);
        }

        // iterating over the list (old way)
        for (int i = 0; i < listSize; i++) {
            System.out.println("This is one of the list items (again): " + l.get(i));
        }

        // selecting part of the list (`note`: lastIndex not included!)
        int centerOfTheList = l.size()/2;
        int nextElement = centerOfTheList + 1;

        // creating a sublist
        List<String> sl = l.subList(centerOfTheList, nextElement + 1); // lastIndex not included!

        // removing element by index
        l.remove(0);

        // removing element "by content" ?
        l.remove("test5");

        // remove a collection of items at once
        List<String> wordsToBeRemoved = Arrays.asList("test8", "test9");
        l.removeAll(wordsToBeRemoved);

        // remove all _but_ a collection items
        List<String> wordsToKeep = Arrays.asList("test2", "test3");
        l.retainAll(wordsToKeep);

        // removes everything from the list
        l.clear();

        // adding element after cleaning the list
        l.add("test100");

    }
}
