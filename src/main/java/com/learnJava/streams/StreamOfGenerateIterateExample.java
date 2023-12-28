package com.learnJava.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
      Stream<String> stringStream =  Stream.of("Adam","Dan","Julie");
        //System.out.println(stringStream.collect(Collectors.toList()));
        stringStream.forEach(System.out::println);
        Stream.iterate(1, a -> a*2)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate((integerSupplier))
                .limit(5)
                .forEach(System.out::println);
    }
}
