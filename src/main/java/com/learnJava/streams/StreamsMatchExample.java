package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMatchExample {

    // allMatch, anyMatch, noneMatch
    public static Boolean match(List<Integer> list){
       return list.stream().allMatch(a -> a==1);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1);
        System.out.println(match(integerList));
    }
}
