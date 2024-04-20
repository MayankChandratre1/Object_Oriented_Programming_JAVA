package oop2_packages_static.StaticExample;

// the variables and methods which are common to the all objects of that class are declared as static
// variables declared w/o static are created every time an object of that class is created
// static vars are created only once i.e. while creating class

/*
    |             |    |                |
    |   Human     |    |    object      |
    | population  |    |    age, name   |
    |             |    |                |


 */

// We can say non-static variables depend upon the object but static ones depend on class

public class StaticA {
    public static void main(String[] args) {

        //population = 0
        Human mayank = new Human(20,"Mayank");//population = 1
        Human kunal = new Human(24,"Kunal");//population = 2

        //we can access static vars using the object of that class
        // it first checks if the object has the var if it didn't find it then it checks if its class has it
        System.out.println(mayank.population);
        System.out.println(kunal.population);
        //it is recommended to use directly the class name to access static elements
        System.out.println(Human.population);
    }
}

class Human{
    int age;
    String name;
    static int population = 0;

    Human(int age, String name){
        this.age = age;
        this.name = name;
        Human.population += 1;
    }

     void printName(){
        System.out.println(this.name);
    }

    static void printAge(){
        System.out.println("");
    }

}