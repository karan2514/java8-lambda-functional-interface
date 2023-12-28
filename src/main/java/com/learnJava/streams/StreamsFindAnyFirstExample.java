package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {

        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(studentOptionalFindAny.isPresent()){
            System.out.println("Find the Student: "+studentOptionalFindAny.get());
        }
        else {
            System.out.println("Student not found");
        }


    // find first implementation
    Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if(studentOptionalFindFirst.isPresent()){
        System.out.println("Find the Student: "+studentOptionalFindFirst.get());
    }
        else {
        System.out.println("Student not found");
    }
}
}
