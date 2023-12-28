package com.learnJava.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> numbers){
      return  numbers.stream()
                .reduce(0,(a,b) -> a>b ? a : b);
    }

    public static Optional<Integer> findMinValue(List<Integer> numbers){
        return  numbers.stream()
                .reduce((a,b) -> a<b ? a : b);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> numbers){
        return  numbers.stream()
                .reduce((a,b) -> a>b ? a : b);
    }
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>(); //Arrays.asList(4,6,32,4,67,89,1);
        List<Integer> integerList2 = Arrays.asList(4,6,32,4,67,89,1);

        System.out.println(findMaxValue(integerList));
        if (findMaxValueOptional(integerList1).isPresent()){
            System.out.println("Max value: "+findMaxValueOptional(integerList1).get());
        }
        else {
            System.out.println("Input List is empty");
        }

        if (findMinValue(integerList2).isPresent()){
            System.out.println("Min value: "+findMinValue(integerList2).get());
        }
        else {
            System.out.println("Input List is empty");
        }


    }
}
