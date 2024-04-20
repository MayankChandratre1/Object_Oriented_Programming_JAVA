package oop6_GenericsAndCustomArrayList;

import java.util.Arrays;

/*

    Problem in this implementation is that we have created only int[] array, but
    what if we want to store a String list then we have to create another MyList with String[]
    array.

    But that will be too much repetition of code. Hence, we use Generics

 */


public class MyArrayList {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;

    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull())
            resize();
        data[size++] = num;
    }

    private boolean isFull(){
        return this.size == data.length;
    }

    private void resize(){
        int[] temp = new int[2*data.length];
        for(int i = 0; i < data.length; i++)
            temp[i] = data[i];
        data = temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int remove(int index){
        int temp = data[index];
        for (int i = index+1; i < data.length; i++){
            data[i-1] = data[i];
        }
        size--;
        return temp;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for(int i = 0; i < 15; i++) list.add(i);
        System.out.println(list);
    }
}
