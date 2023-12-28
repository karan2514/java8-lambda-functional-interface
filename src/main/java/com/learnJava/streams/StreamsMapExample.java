package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {
    public static List<String> namesList (){

        List<String> names = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toList());
        return names;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
