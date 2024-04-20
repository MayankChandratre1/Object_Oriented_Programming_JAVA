package oop2_packages_static;


/*
*  A class which is allowed to have only one of its objects is called SingletonClass
*  We can have only one instance of that class
*  Whenever someone need the object of this class it can use the same instance
*/

/* To implement this we must first know that to prevent others from creating objects of this class
*  We actually need to prevent others from calling the constructor of the class.
*  we do it by making the default constuctor private.
* */


/* Now only this class can call its constructor
*  We create a method getInstance() which will return the reference of this instance/object
*  This method must be static because it cannot be depended on the objects of the class*
* */

/*
* If the method is called for first time, it will create a object and store its reference into a static variable of
* class. (SingletonClass ref;)
*
* Next time the method is called , same ref will be returned.
* */


public class SingletonClass {
    private SingletonClass(){
        System.out.println("Object of SingletonClass is created");
    }

    private static SingletonClass ref;

    public static SingletonClass getInstance(){
        if(ref == null) ref = new SingletonClass();
        return ref;
    }


}


