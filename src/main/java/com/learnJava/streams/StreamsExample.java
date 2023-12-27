package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> studentPredicate= (student -> student.getGradeLevel()>=3);
    static Predicate<Student> studentGPAPredicate= (student -> student.getGpa()>=3.9);
    public static void main(String[] args) {

      Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
              .peek((student -> System.out.println(student)))
              .filter(studentPredicate)
              .peek((student -> System.out.println(" students after the 1st filter "+student)))
              .filter(studentGPAPredicate)
              .peek((student -> System.out.println(" students after the 2nd filter "+student)))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
    }
}
