package oop6_GenericsAndCustomArrayList;

/*
    to compare objects we use generic interface Comparable<T>.
    We define a compareTo(obj) function which will determine how our objects are
    compared.



 */

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    int marks;

    /*
    If we directly compare this object with <,>,etc. then how will java know
    if we want to compare with marks or roll no.
    So we use comparable
     */

    public Student(int rno, int marks) {
        this.rno = rno;
        this.marks = marks;
    }

    //This is method
    /*
        This method must return a integer value i.e. difference between
        the value of mentioned fields of objects

        int diff = ob1.compareTo(ob2)

        diff = 0, ob1 == ob2
        diff > 0, ob1 > ob2
        diff < 0, ob1 < ob2
     */


    /*
    When we create a list of objects say Student[] list.
    And we call Arrays.sort(list)
    by default it will call a similar function as compareTo which compares
    first Number field of object.
     */
    @Override
    public int compareTo(Student ob) {
        return (int)(this.marks-ob.marks);
    }


    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", marks=" + marks +
                '}';
    }
}


public class ComparatorExample {
    public static void main(String[] args) {
        Student s1 = new Student(12,89);
        Student s2 = new Student(11,90);
        Student s3 = new Student(10,79);
        Student s4 = new Student(13,56);

        Student[] list = {s1,s2,s3,s4};

        System.out.println(Arrays.toString(list));
        // if our object didn't have a compareTo method this will give error
        // Or we can pass a lambda function or comparator object to sort method
        Arrays.sort(list, (o1, o2) -> o1.rno- o2.rno);
        System.out.println(Arrays.toString(list));

    }
}
