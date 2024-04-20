package oop3_principalsOfoop.polymorphism;


/*
                                      RUNTIME POLYMORPHISM
    Often the Runtime polymorphism will occur in accordence with the Inheritance i.e. related classes
    It is achieved by Method Overriding


    When a method of parent class is redefined with same signature but different body in its subclass it is
    called as Method Overriding.

    Here area() method is defined in the Shapes(parent) class but also define in all of its
    children that is Circle, Square

    When we will call the area() method via object of Circle class
    this "Area of circle" will be printed.
    i.e. in nutshell the method is overriden by Circle class.

    It is called runTime polymorphism because Java will decide which method to call
    at the time of running the .class file

    Some key points:-
  1.
    _______

    Shapes sq = new Square();
    sq.area()
    _______

    This will give us "Area of square" as output.
    Point to be noted is--
        If shapes class didn't have the area method then this line would have given us error.
        Because the access of an object to a method/variable is decided by the reference variable.
        At compile time Java will check , Does Shapes have area() method? yes then its okay.
        But if it didn't have it then it's not okay.
        But which method is to be called the one in Shapes class or the One in  Square class
        is decided at the Runtime.

   2. To acheive overriding the methods must -
        Have same signature
        Be present in related classes.

   3. To check if a method is being overriden or not we use @Override annotation
        if method is not being Overriden this annotation will throw error at compiletime
        Ex. in square class.

    4. Which method is called is decided by the type of object.

    5. If the method is declared final then it cannot be overriden.
        It helps compiler to quickly identify that this method won't be overriden so, it's binded quickly
        to it's every occurrence during compiling. Called  EARLY BINDING
        Regular Overriding is called LATE BINDING

    6. If a class is final then all its methods are final

    7. static methods cannot be overriden because static depends on class but overriding depends on objects.

 */



public class Shapes {

    void area(){
        System.out.println("Area of Shapes class");
    }

    final void finalmethod(){
        System.out.println("i wont be overriden because im final");
    }

    static void staticmethod(){
        System.out.println("i wont be overriden because im static");
    }
}
