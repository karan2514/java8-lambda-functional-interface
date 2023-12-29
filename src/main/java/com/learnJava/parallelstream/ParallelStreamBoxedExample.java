package com.learnJava.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList){
        Long startTime = System.currentTimeMillis();
      int sum = integerList.stream()
                .reduce(0,(a,b)->a+b);
        Long duration = System.currentTimeMillis()-startTime;
        System.out.println("Duration in sequential Stream : "+duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList){
        Long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .parallel()
                .reduce(0,(a,b)->a+b);
        Long duration = System.currentTimeMillis()-startTime;
        System.out.println("Duration in parallel Stream : "+duration);
        return sum;
    }
    public static void main(String[] args) {
     List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());

        sequentialSum(integerList);
        parallelSum(integerList);
    }

}
