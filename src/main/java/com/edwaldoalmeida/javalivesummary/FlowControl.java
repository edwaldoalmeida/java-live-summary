package com.edwaldoalmeida.javalivesummary;

public class FlowControl {
    public static void main(String[] args) {

        // if
        int loop = 0;
        if (loop >= 0) {
            System.out.println("The variable `loop` is greater or equals to 0, so I was printed.");
        } else if (loop < 0) {
            System.out.println("The variable loop is less than 0, so I was printed.");
        } else {
            System.out.println("That is never going to happen.");
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("I'm inside a while loop and this is the iteration number:" + i );
            i += 1;
        }


        // do-while
        int j = 0;
        do {
            System.out.println("I'm inside a do-while loop and this is the iteration number:" + j );
            j += 1;
        } while (j < 5);

        // for ("traditional")


        // for ("modern")





    }

}
