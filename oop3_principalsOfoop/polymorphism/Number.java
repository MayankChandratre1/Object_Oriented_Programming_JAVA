package oop3_principalsOfoop.polymorphism;

/*
                            COMPILETIME POLYMORPHISM

      Compile Time polymorphism is incorporated in the same class.

      When two or more methods in same class have same name but different implementations
      it's called method Overloading.

      Ex. We can have multiple constructors with different arguments.

      The overloading methods must -
        Have same name and class
        Have either different - return type & arguments, Number of args, type of args, order of types of args

      It's called compile time because Which implementation of sum() method will be called is determined at the
      time of compiling.
     
 */


public class Number {

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, int b){
        return a+b;
    }

    double sum(int a, double b){
        return a+b;
    }
}
