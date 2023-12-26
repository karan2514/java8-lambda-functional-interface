package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println("name of the student: "+ name+" Activities of the student"+activities);
            studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));


    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println(a +" and " +b);
        };

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println(a*b);
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println(a/b);
        };

biConsumer.accept("java7", "java8");
        multiply.andThen(division).accept(5,5);
        nameAndActivities();
    }
}
