package oop4_accessModifiers.packageOne;


/*
        ACCESS MODIFIERS :-

        MODIFIER    CLASS | PKG | SUBCLASS(SAME PKG) | SUBCLASS(DIFF PKG) | WORLD

        public        1      1          1                      1              1
        protected     1      1          1                      1              X
        default       1      1          1                      X              X
        private       1      X          X                      X              X


 */


/*
    When to use which modifier:

    private - When data needs to be most secure

    default - When you want data to be pkg-specific

    protected - When you want data to be relation-specific

    public - Only when data needs to be accessed by anyone
 */


/*
    Key points about protected modifier -

    When we declare a var as protected
    Say, protected int num = 10; in class A

    We create another class B in diff pkg, which extends A.
    Then in class B, only object of B can access num, not even the object of A will access it
    if it is in different pkg.

    Because class A never knows which class has extended it, so it is not allowed to access
    protected variables outside its pkg, but it's children from other pkgs can access it
 */




public class Main {

}
