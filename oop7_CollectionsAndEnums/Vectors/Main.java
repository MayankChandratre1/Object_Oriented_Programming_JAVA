package oop7_CollectionsAndEnums.Vectors;

/*

    Vector is class which implements List<> interface.
    It's just an ArrayList but synchronised.

    i.e. In multithreading, Multiple threads can access a ArrayList at same time.

    ArrayList <-- T1
              <-- T2
              <-- T3

          But Vector can be accessed by single thread at a time.

    Vector <-- T1
           wait T2
           wait T3


           People prefer ArrayList over Vector because it is faster,
           But vector are used where data structure needs to be thread-safe.
 */


import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        vec.add(1);
        vec.add(2);
        vec.add(34);
        vec.add(4);

        System.out.println(vec);
    }
}
