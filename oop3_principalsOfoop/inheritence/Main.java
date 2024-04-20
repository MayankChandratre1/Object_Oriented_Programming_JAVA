package oop3_principalsOfoop.inheritence;


/*
Main class to demonstrate the relation betn Box And BoxWeight
 */


public class Main {
    public static void main(String[] args) {

        //Creating object of BoxWeight class w/o params
        BoxWeight b2 = new BoxWeight();
        b2.printInfo();

        // We can create a ref variable of parent class and assign it a ref of child
        //its called UpCasting
        // Its just like a parent ref its child
        Box b3 = new BoxWeight();
        //But the parent won't be able to access the properties specific to the chile, here weight
       // X System.out.println(b3.weight);

        // we cannot refer to parent object using reference var of child
        // X BoxWeight b4 = new Box()
        // Because if we call the parents constructor only then some of the fields in child may remain uninitialised


        //If both child and parent have same var then

        //Reference var of parent class will access the var in parent cass
        Female p1 = new Female("Manisha");
        System.out.println(p1.name);//Manisha

        //Reference var of child class will access the var in child cass
        Person p2 = new Female("Manisha");
        System.out.println(p2.name);//Mangesh

    }
}


class Person{
    String gender;
    String name = "Mangesh";

    Person(String gender){
        this.gender = gender;
    }

    Person(String gender, String name){
        this.gender = gender;
        this.name  = name;
    }

}

class Female extends Person{
    String name;

    Female(String name){
        super("Female");
        this.name = name;
    }
}