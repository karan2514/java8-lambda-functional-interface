package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(){
      return   StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());

    }

    public static List<Student> sortStudentByGPA(){
        return   StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());

    }

    public static List<Student> sortStudentByGPADesc(){
        return   StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());

    }

    public static void main(String[] args) {
        System.out.println("Students sorted by GPA : ");
        sortStudentByGPA().forEach(System.out::println);

        System.out.println("Students sorted by GPA Desc : ");
        sortStudentByGPADesc().forEach(System.out::println);
    }
}
