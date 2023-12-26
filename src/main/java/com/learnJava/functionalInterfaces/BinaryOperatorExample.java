package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(5,7));

        BinaryOperator<Integer> b1 = BinaryOperator.maxBy(comparator);
        System.out.println(b1.apply(5,5));
    }
}
