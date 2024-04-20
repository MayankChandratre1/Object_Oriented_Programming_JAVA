package oop6_GenericsAndCustomArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {
    /*
    One-liner functions which can be anonymous.
     */

    int operate(int a, int b, Operation operator){
        return operator.op(a,b);
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i < 10; i++){
//            list.add(i);
//        }
//
//        list.forEach((item)->{
//            System.out.println(item*3);
//        });

        /*
        Lambda expressions can be passed as an argument to other function
        They are actually objects of Consumer<T> class.
        We can create our own interface which have only one method which we can initialise
        using lambda exp.

        The interface must contain only one method.
         */
        Operation sum = (a,b)->a+b;
        Operation mul = (a,b)->a*b;
        LambdaExample lm = new LambdaExample();
        System.out.println(lm.operate(5,6,sum));
        System.out.println(lm.operate(5,6,mul));
    }
}

interface Operation {
    int op(int a, int b);
}
