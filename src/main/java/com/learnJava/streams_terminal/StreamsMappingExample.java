package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {
    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("nameList :"+ nameList);
    }
}
