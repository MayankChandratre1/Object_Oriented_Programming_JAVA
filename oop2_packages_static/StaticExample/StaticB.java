package oop2_packages_static.StaticExample;


// outer classes cannot be static
// a simple property of static is whatever declared as static will depend on its class
// What class does outer classes have.. they don't
// Hence we cannot declare them static


// But what if we declare a class inside another class
// Then we cannot create the objects of this inner-class in the
// main method of outer class until and unless the inner-class is static

// So we can declare them static to avoid this problem.

// Note: ** Imp **
// Whatever variabes and methods are declared in this inner-class wont be static if the class is declared static
// Only the inner-class itlesf be static




public class StaticB {
     // This inner class is declared static so we can create its objects in main method
     // as well as in class
     static class Test{
        String s;
        Test(String s){
            this.s = s;
            System.out.println(s);
        }
    }
    Test t = new Test("Test");


    // This class is non-static hence it will give an error if we try to create its object in main method
    // We can still create its objects in class
    class TestError{
        static String s = "Hi";
        TestError(String s) {
            this.s = s;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StaticB b = new StaticB();
        StaticB a = new StaticB();
        Test t = new Test("mayank");
        //we can still refer to the static variables of non static classes in our main method
        // Simple rule:-
        // Whatever is static can only be referenced in static methods/context without using objects
        // Hence we cannot use class TestError as class to create objects because TestError is non-static
        // But we can refer TestError.s because its static
        System.out.println(TestError.s);
    }
}



//If you need to do computation in order to initialize your static variables,
//you can declare a static block that gets executed exactly once, when the class is first loaded.

class NewStatic{
    static int a = 5;
    static int b;
    static{
        System.out.println("static block is called");
        b = a*20;
        System.out.println(b);
    }

    static void printH(){
        System.out.println("hello");
    }
}
