package com.edwaldoalmeida.javalivesummary;

import java.util.Arrays;  // lots of useful array-related methods!

public class Arrayz {
    public static void main(String[] args) {

        // creating and initializing an Array (#1)
        int[] Array1 = new int[2];
        Array1[0] = 10;
        Array1[1] = 20;
        try {
            Array1[2] = 30;  // it will produce an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // creating and initializing an Array (#2)
        int[] Array2 = new int[] {10, 20, 30};  // can also be created like this, size will be determined by the length of the list provided
        System.out.println(Array2.length);
        System.out.println("First element: " + Array2[0]);
        System.out.println(Arrays.toString(Array2));
        for (int item : Array2) {
            System.out.println(item);
        }

        // creating and initializing an Array (#3)
        int[] Array3 = {10, 20, 30};
        System.out.println(Array3.length);
        System.out.println(Arrays.toString(Array3));
        
        // iterating over an Array (#1)
        for (int item : Array3) {
            System.out.println(item);
        }

        // iterating over an Array (#2) (if I need more control over which values to iterate over)
        for (int i=0; i < Array3.length; i++) {
            System.out.println(Array3[i]);
        }

        // getting the last element of an Array
        System.out.println("Last element of Array3: " + Array3[Array3.length - 1]);
    }
}
