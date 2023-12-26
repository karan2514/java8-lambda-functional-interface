package com.learnJava.functionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionInterface {

    static Function<String,String> function =(name) -> name.toUpperCase();
    static Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");

    //static Function<Integer,Integer> addOne = x -> x + 1;
    //static Function<Integer,Integer> multiplyTwo = x -> x * 2;

    public static void main(String[] args) {
        System.out.println("Result is: " +function.apply("java8"));
        System.out.println("Result of and then is: " +function.andThen(addSomeString).apply("java8"));
        System.out.println("Result of compose is: " +function.compose(addSomeString).apply("java8"));
        //System.out.println("Result of addOne is: " +addOne.andThen(multiplyTwo).apply(5));
        //System.out.println("Result of compose is: " +addOne.compose(multiplyTwo).apply(5));
    }
}
