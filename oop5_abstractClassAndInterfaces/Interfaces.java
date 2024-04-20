package oop5_abstractClassAndInterfaces;


/*

    Interfaces are feature provided by java which tells
    what a class should have rather than implementing it.
    It tells what the class is doing , not how it doing it.

    SYNTAX:-
    interface Name;
 */

/*
    RULES:-

    1. Cannot create objects of interface.
    2. They must be inherited using 'implements'.
    3. It provides Multiple inheritance.
    4. Variables are static and final by default.
    5. Methods are abstract by default.
    6. You can use ref var of interface to store object of its child,
        But you cannot call methods not present in that interface.
    7. As its func depends on runtime polymorphism they are not
        recommended in performance critical apps.
    8. We can extend interfaces with other interfaces.
    9. If two interfaces have methods with same name, but you can
        still implement both to a class, it will create confusion
    10. Use separate classes that implement these interfaces separately.
    11. We can have default implementation in java 8+
            syntax: default void fun(){}
    12. We cannot implement two interfaces with same method having default.
    13. We can have static methods in interface, but they must've a body.
 */

public class Interfaces {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.brake();
        c.stop();

        Brake b = new Car();
        b.brake();

        Engine e = new Car();
//        e.brake(); error
        e.start();
    }
}

class Car implements Brake, Engine{

    @Override
    public void brake() {
        System.out.println("bracke");
    }

    @Override
    public void start() {
        System.out.println("started");
    }

    @Override
    public void stop() {
        System.out.println("stopped");
    }
}

interface Brake{
    void brake();
}

interface Engine{
    int price = 50_000;
    void start();
    void stop();
}