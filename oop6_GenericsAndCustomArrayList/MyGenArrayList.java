package oop6_GenericsAndCustomArrayList;

/*

    Generics in java are used to create data structures with parameterised types.
    Syntax: in declaration of class
        public class ClassName<T>{}

    that <T> is the generic type.

    We have to specify what type will be stored in this list at the time of
    object creation
    ClassName<Integer> obj = new ClassName<>();


    Idea of generics is to provide a way that a certain data structure can be applied to
    all data types but its type can and must be restricted during its use
    - We can store strings, integers, floats in arraylist
    - We cannot store different data types in same list

    while writing the functions and variables in these classes we have to use T
    to declare data types or return types.


    RULES:
    1. We cannot use generics in static fields because they don't depend on objects of class
    2. We cannot replace generics with primitives
    3. We cannot overload methods having diff parameterised arguments
        void meth(List<Integer>)
        void meth(List<String>)
    4. we cannot use instanceof method.
 */

import java.util.Arrays;

public class MyGenArrayList<T> {
        //private T[] data; // whenever we will create objects the T will be replaced by parameter type.
        private Object[] data;
        private final static int DEFAULT_SIZE = 10;
        private int size = 0;


        //Problem is we cannot create object of T in this class.
        /*
        Reason: The replacement of T with parameter takes place at runtime. Means the byte code does not have
                any info of T until it runs. Hence, we cannot create objects of T.
                At compiling TYPE ERASURE occurs , all generics are removed at compile time and
                add casting or Object class wherever needed.
                Simply, bytecode don't know what is T.
         */


        public MyGenArrayList() {
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if(isFull())
                resize();
            data[size++] = num;
        }

        private boolean isFull(){
            return this.size == data.length;
        }

        private void resize(){
            Object[] temp = new Object[2*data.length];
            for(int i = 0; i < data.length; i++)
                temp[i] = data[i];
            data = temp;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public T remove(int index){
            T temp = (T)data[index];
            for (int i = index+1; i < data.length; i++){
                data[i-1] = data[i];
            }
            size--;
            return temp;
        }

        public T get(int index){
            return (T)data[index];
        }

        @Override
        public String toString() {
            return "MyArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }


        public static void main(String[] args) {
            MyGenArrayList<Integer> list = new MyGenArrayList<>();
            list.add(45);
            for (int i = 0; i < 12; i++) list.add(i);
            System.out.println(list);
        }
    }



