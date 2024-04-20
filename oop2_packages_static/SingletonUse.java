package oop2_packages_static;

public class SingletonUse {
    public static void main(String[] args) {
        // We will create 3 ref var of SingletonClass
        // we will assign them with SingletonClass.getInstance() method
        // We can see on console that constructor was called only once, i.e. only one object was created.

        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        SingletonClass s3 = SingletonClass.getInstance();

    }
}
