package com.learnJava.numericstreams;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("sum is : "+ sum);

        OptionalInt max = IntStream.rangeClosed(0,0).max();
        System.out.println(max.isPresent() ? max.getAsInt():0);

        OptionalLong min = LongStream.rangeClosed(50,100).min();
        System.out.println(min.isPresent() ? min.getAsLong():0);

        OptionalDouble average = IntStream.rangeClosed(1,50).average();
        System.out.println(average.isPresent() ? average.getAsDouble():0);
    }
}
