package com.learnJava.streams_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int sum(List<Integer> integerList){
       return integerList.stream()
                .collect(summingInt(Integer::intValue));
    }
    public static Double avg(List<Integer> integerList){
        return integerList.stream()
                .collect(averagingInt(Integer::intValue));
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,2);
        List<Integer> integerList1 = Arrays.asList(10,2,5,7,3);
        System.out.println("Sum is : "+sum(integerList));
        System.out.println();
        System.out.println("Avg is : "+avg(integerList));

    }
}
