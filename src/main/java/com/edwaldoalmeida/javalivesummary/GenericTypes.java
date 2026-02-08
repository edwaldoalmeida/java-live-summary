package com.edwaldoalmeida.javalivesummary;

// A generic type is a generic Class or Interface that is parametrized over types
// eg:
// class className<T1, T2, ..., Tn> {...}
// interaface interfaceName<T1, T2, ..., Tn> {...}

public class GenericTypes {
    public static void main(String[] args) {
        // "plain" Class, without any typing
        class PlainContainer {
            private Object object;

            public void set(Object object) { this.object = object; }
            public Object get() { return object; }
        }
        PlainContainer plainContainer = new PlainContainer();
        plainContainer.set("blah");
        plainContainer.set(1);

        // generic Class
        class GenericContainer<E> {
            private E object;

            public void set(E object) { this.object = object; }
            public E get() { return this.object; }
        }
        GenericContainer<String> genericContainer = new GenericContainer<>();
        genericContainer.set("blah");
        // genericContainer.set(1); // generates an error @ compile time

    }
}
