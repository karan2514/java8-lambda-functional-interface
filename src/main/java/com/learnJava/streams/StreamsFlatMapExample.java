package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printListOfActivities(){
      List<String> activities = StudentDataBase.getAllStudents().stream()
              .map(Student::getActivities)
              .flatMap(List::stream)
              .distinct()
              .collect(toList());
      return activities;
    }

    public static Long printListOfActivitiesCount(){
        Long count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return count;
    }
    public static void main(String[] args) {
        System.out.println(" printListOfActivities "+ printListOfActivities());
        System.out.println("count is  "+printListOfActivitiesCount());
    }
}
