package oop6_GenericsAndCustomArrayList;

import java.util.Arrays;

/*

 What if we wanted only Number type of data to be used in our data type.
 Then we have to restrict this type parameter
 We do it by using wildcards.

 Syntax <? extends Class>
 Then we can only pass Class or Subclasses of Class in this Type parameter.

 */


public class WildCards<T extends Number> {

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


        public WildCards() {
            this.data = new Object[DEFAULT_SIZE];
        }


        public void getList(WildCards<? extends Number> obj){
            return;
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
            oop6_GenericsAndCustomArrayList.MyGenArrayList<Integer> list = new oop6_GenericsAndCustomArrayList.MyGenArrayList<>();
            list.add(45);
            for (int i = 0; i < 12; i++) list.add(i);
            System.out.println(list);
        }
    }





