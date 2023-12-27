package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

//    class name:: method name
    static Consumer<Student> ci = System.out::println;

    static Consumer<Student> activities = Student::printListOfActivities;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(ci);

        StudentDataBase.getAllStudents().forEach(activities);

    }
}
