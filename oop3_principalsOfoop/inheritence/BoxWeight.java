package oop3_principalsOfoop.inheritence;

//This is child class

/*
    Inheritance is just a child getting the properties of its parent
    Similarly in java when a class(child) inherits an other class(parent) it simply means that all the properties of parent class
    are accessible by child class unless they are not declared as private by parent.

    Analogy : A child can use house of the parent, but it cannot use parent's money directly because money is
              only accessed by the parent i.e. its private for parent.
 */


/*
    A child class here BoxWeight inherits parent here Box using the 'extends' keyword
    Now the BoxWeight can access all the non-private properties of Box class
 */

public class BoxWeight extends Box {
    double weight;

    /*
    Always Remember in child class constructors, no matter what the constructor of parent class
    is called first.

     As the child is accessing the properties of parent , they must be initialised first

     We can call the constructor of parent by using super()

     'super' keyword is just like 'this' keyword

      'this' will refer to the same object but super will refer to parent class


      we can also use this instead of super but it will create conflicts if the parent and child have same variable.
      p.s. the BoxWeight and Box classes can have their own weight variable
     */

    BoxWeight() {
        System.out.println("Default constructor of BoxWeight is called");
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println(super.l+" "+super.w+" "+super.h+" "+this.weight);
    }
}
