package oop6_ExceptionHandlingAndObjectClone;

/*

    We use Cloneable interface to clone objects faster in Java.
    .clone() is a method of object class
    but to use it we have to implement Cloneable interface.
    without it, it will throw CloneNotSupportedExp.
    Cloneable doesn't have any methods, but it just tells JVM that cloning will occur.


    advantages:
        1. Faster.
        2. Smaller code.
        3. Efficient in copying bigger objects.
 */


/*
    Shallow Copy:-
        It will copy values of primitives.
        But for Objects its just passing same ref.

        Ex. myObj has a [2,3,4] array.
            twin = myObj.clone() //shallow
            twin.arr[0] = 100;
            >myObj.arr [100,3,4]
            >twin.arr [100,3,4]

     Deep Copy:-
        It will create new variables for objcets too.

         Ex. myObj has a [2,3,4] array.
            twin = myObj.clone() //deep
            twin.arr[0] = 100;
            >myObj.arr [2,3,4]
            >twin.arr [100,3,4]
 */


public class ObjectClonning {


    public static void main(String[] args) throws CloneNotSupportedException {
        Human mk = new Human("Mayank",20);

//        Human twin = new Human(mk); // making a copy of mk
        // Problem is it uses new keyword so it will create load on performance
        // because it will take time during runTime.

        Human twin2 = (Human)mk.cloneShallow();

        System.out.println(twin2.name + " " + twin2.age);


    }

}


class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //The clone method throws this exception ( SHALLOW )
    public Object cloneShallow() throws CloneNotSupportedException {
        //This is shallow copying
        return super.clone();
    }


    //The clone method throws this exception ( DEEP )
    public Object cloneDeep() throws CloneNotSupportedException {
        //This is deep copying

        Human twin = (Human)super.clone();//shallow copy

        twin.arr = new int[this.arr.length];

        int k = 0;
        for(int i: this.arr) twin.arr[k++] = i;

        return twin;

    }


    /*
    We are copying this object using these constructor.
     */
//    public Human(Human h) {
//        this.name = h.name;
//        this.age = h.age;
//    }
}
