package oop3_principalsOfoop.inheritence;

// This is parent class


public class Box {
    double l;
    double h;
    double w;

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box() {
        System.out.println("Default Box Constructor is called");
        this.w = -1;
        this.l = -1;
        this.h = -1;
    }
}
