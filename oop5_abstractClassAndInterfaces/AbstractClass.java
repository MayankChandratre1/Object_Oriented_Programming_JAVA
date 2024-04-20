package oop5_abstractClassAndInterfaces;


/*

    Let's first recall a few concepts  from inheritance.
    We know that java does not support Multiple inheritance, Because
    If a child class C had two parents A and B then it can create an
    ambiguity when we call an inherited method.
    Like, say, class A and B have method with name talk() and C inherits
    both classes, and now we call C.talk(); which one will it call??


    But what if C overrides talk() method?...It will work because
    now java knows C has its own talk().
    But How do we make sure that the method gets override.
    WE MAKE IT ABSTRACT.

    ## ABSTRACT METHOD:- A method which has only signature and not body.

        - Me must have to override it before use.

        - SYNTAX:
          abstract access_mod return_type name();


        - What if some one creates a object of a class containing abstract method
        and calls name();?? It should not happen hence,
        - IMP: A class containing abstract methods must be abstract itself.
        We cannot make objects of abstract class.
 */


/*
        RULES:-
        1. A class containing abstract methods must be abstract itself.
        2. We cannot make objects of abstract class.
        3. We cannot create abstract static methods because they are not
           override
        4. We can create normal or static methods is abstract class.
        5. We can include variables and constructors in abstract class.
        6. We can use ref var of Parent to store child object.
        7. We cannot have final abstract class.
        8. It still doesn't support Mult. Inheritance cause it still
            allows us to have normal methods like talk();
 */





public class AbstractClass {
}
