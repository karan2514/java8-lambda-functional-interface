package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Integer number=2;

    static Predicate<Integer> s1 = s -> s % 2 == 0;
   static Predicate<Integer> s2 = s -> s % 5 == 0;

    public static void predicateAnd(){
        System.out.println("Predicate AND result is: "+s1.and(s2).test(10)); // predicate chaining
    }

    public static void predicateOr(){
        System.out.println("Predicate OR result is: "+s1.or(s2).test(15)); // predicate chaining
    }

    public static void predicateNegate(){
        System.out.println("Predicate NEGATE result is: "+s1.or(s2).negate().test(15)); // predicate chaining
    }

    public static void main(String[] args) {
       /* Predicate<Integer> evenOrNot = s -> {

            return s % 2 == 0;
        };

       Boolean b= evenOrNot.test(number);
       if (b == true) System.out.println(number+" is a even number");
       else System.out.println(number+" is not an even number");
        System.out.println(b);*/

predicateAnd();
        predicateOr();
        predicateNegate();
    }

}
