package oop2_packages_static.packageA;

// packages are used to create files/classes with same names in same project
// Simply package is a Folder
// We have to specify in which package our class lies using 'package' keyword in 1st line


import static oop2_packages_static.packageB.Message.message;
import static oop2_packages_static.packageB.Message.number;
import  oop2_packages_static.packageB.Message;
// we can import methods and variables of other files in different packages using 'import' keyword
// import keyword takes a relative or absolute path as an argument
// The variable/method to be imported must be public and static
// we dont need to use import if files are in same package
//we can import whole class and make its object too
public class Hello {
    public static void main(String[] args) {
            greet();
            message();
            Message ms = new Message();
            System.out.println(number);
    }

    public static void greet(){
        System.out.println("In package A");
    }
}
