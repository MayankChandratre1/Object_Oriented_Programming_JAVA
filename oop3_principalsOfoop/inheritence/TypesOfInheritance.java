package oop3_principalsOfoop.inheritence;






public class TypesOfInheritance {
    public static void main(String[] args) {
//        Human h1 = new Human();
          Student s1 = new Student(18,"Mahesh","Btech");

    }
}


                                            /*  Types of Inheritance */

/*
    1. Single Inheritance

    Parent class -> Child class

    This is all about single inheritane.

    Ex. Human extends Animal
 */

class Animal{
    int age;

    Animal(){
        System.out.println("Default constructor of animal is called");
    }

    Animal(int age){
        this.age = age;
    }

    public void move(){
        System.out.println("It moved");
    }
}


class Human extends Animal{
    String name;

    Human(){
        System.out.println("Default constructor of human is called");
    }

    Human(int age, String name){
        super(age);
        this.name = name;
    }

    public void wear(){
        System.out.println("It wears cloths");
    }
}


/*
    2. Multilevel Inheritance

    Parent class -> Child class -> Grandchild class -> ...

    It's like having generations.
    Note: A child class in this chain has access to info of all the classes above it.
          But a parent class in this chain won't have access to below classes

    Ex. Student extends Human &
        Human extends Animal
 */

class Student extends Human{
    String degree;

    Student(){
        System.out.println("default Student constructor is called");
    }

    public Student(int age, String name, String degree) {
        super(age, name);
        this.degree = degree;
    }

    public void exam(){
        System.out.println("It gives exam");
    }
}

/*
    3. Multiple Inheritance

    One child class have more than one parent.

    Parent1 -->
                --> Child1
    Parent2 -->

    Problem: Ambiguity
        What if parent1 has a var int num;
        and parent2 also has var int num;
        and child1 access the num, then what will be the output? how will it
        know which num to access.
        Hence, it's not supported in Java directly.

    It is allowed with the help of Interfaces.

 */


/*
    4. Hierarchical Inheritance

    One parent has many children and so on.

    Parent1 --> child1 --> gchild11
                       --> gchild12
            --> child2 --> gchild21
                       --> gchild22
                       --> gchild23
            --> child3


    Ex. Dog extends Animal
        Human extends Animal
        Cat extends Animal
 */

class Dog extends Animal{
    String loyalty;
}

class Cat extends Animal{
    String lives;
}

/*
    5. Hybrid Inheritance

    One parent can have many children and its GrandChildren can have more than one parent
    Basically it's Hierarchical + Multiple
           --> child1
     Parent          --> gChild
           --> child2

     Not supported directly in java.
 */