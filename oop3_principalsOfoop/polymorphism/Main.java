package oop3_principalsOfoop.polymorphism;

/*
    Polymorphism
    Act of presenting the same entity as differnt entities.
    Same method is implemented differently in same or related classes.


    When some method/object behaves differenty according to input circumstances
    is called polymorphism

    Types: CompileTime & RunTime


    Ex. Shapes class -> RunTime
        Number class -> CompileTime
 */



public class Main {
    public static void main(String[] args) {

        //Explanation in Shapes Class
        Shapes sq = new Square();
        sq.area();
    }
}
