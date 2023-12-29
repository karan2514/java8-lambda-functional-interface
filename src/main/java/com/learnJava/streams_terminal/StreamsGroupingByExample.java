package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender(){
      Map<String,List<Student>> students = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(students);
    }


    public static void customizedGroupBy(){
        Map<String,List<Student>> students = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE"));
        System.out.println(students);
    }

    public static void twoLevelGrouping_1(){

       Map<Integer,Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGradeLevel(),
                        groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void threeLevelGrouping(){

       LinkedHashMap<String, Set<Student>> studentLinkedHasgMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()
                        ));
        System.out.println(studentLinkedHasgMap);
    }

    public static void calculateTopGpa(){
      Map<Integer,Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                      collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1);
    }

    public static void calculateLeastGpa(){
        Map<Integer,Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1);
    }
    public static void main(String[] args) {
       // groupStudentsByGender();
        System.out.println();
        //customizedGroupBy();
       // twoLevelGrouping_1();
        //threeLevelGrouping();
        //calculateTopGpa();
        calculateLeastGpa();
    }
}
