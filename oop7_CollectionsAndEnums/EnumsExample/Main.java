package oop7_CollectionsAndEnums.EnumsExample;


/*
    Enums (Enumerations) are like group of constant variables.
    like group of months : JAN, FEB, MAR,...,DEC.
    It also has some methods.
    It's declared like a class.

    They extend a java.lang.Enum class

    syntax

    enum Name{
        CONST1, CONST2, CONST3,...;
    }


    These members are public, final and static by default

    So we cannot inherit enums.

    We access it as,
    Name nm = Name.CONST1;

    or
    for(Name nm: Name.values()){ do something }

    or
    int index = Name.CONST1.ordinal(); // returns index of CONST1 in enum.


    Enums have a constructor but its either default or private , hence, We cannot call it.
    The CONSTs are actually objects which call this constructor at the time of creation of Enum.

    We can implement interfaces on enum but not classes.

    Methods:
    Name.valueOf("Monday") //Monday
    Name.values() // array -> [CONST1, CONST2, ...]
    nm.ordinal() // index of nm in Name
 */

public class Main {
    public static void main(String[] args) {
        Week one = Week.Monday;
        System.out.println(one);
    }
}
