package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

   static Predicate<Student> studentPredicate = s -> s.getGradeLevel()>=3;
    static Predicate<Student> studentPredicate1 = s -> s.getGpa()>=3.9;
    public static void filterCustomersByGradeLevel(){
        System.out.println("Filter Students by Grade Level");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student)->
                {
                    if (studentPredicate.test(student)) System.out.println(student);


                }
                );
    }

    public static void filterCustomersByGpa(){
        System.out.println("Filter Students by GPA Level");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student)->
                {
                    if (studentPredicate1.test(student)) System.out.println(student);

                }
        );
    }

    public static void filterStudentsByGradeAndGpa(){
        System.out.println("Filter Student By Grade and GPA");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student)->
                {
                    if (studentPredicate.and(studentPredicate1).test(student)) {System.out.println(student);}

                }
        );
    }
    public static void main(String[] args) {
      filterCustomersByGradeLevel();
        filterCustomersByGpa();
        filterStudentsByGradeAndGpa();
    }
}
