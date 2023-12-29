package com.learnJava.streams_terminal;

import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.maxBy;

public class StreamsCountingExample {

    public static Long count(){
     return StudentDataBase.getAllStudents().stream()
             .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }
    public static void main(String[] args) {

        System.out.println(count());
    }
}
