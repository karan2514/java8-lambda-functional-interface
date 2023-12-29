package com.learnJava.parallelstream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {
    public static List<String> sequential_printListOfActivities(){

        Long startTime = System.currentTimeMillis();

        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        Long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime-startTime));
        return activities;
    }

    public static List<String> parallel_printListOfActivities(){
        Long startTime = System.currentTimeMillis();

        List<String> activities = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        Long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in Parallel : " + (endTime-startTime));
        return activities;
    }
    public static void main(String[] args) {
        sequential_printListOfActivities();
        System.out.println();
        parallel_printListOfActivities();
    }
}
