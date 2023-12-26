package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

   static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName(){
        Consumer<Student> c2 = (student) -> System.out.println(student);

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
         List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));

    }
    public static void printNameAndActivitiesUsingCondition(){
         List<Student> studentList = StudentDataBase.getAllStudents();
         studentList.forEach((student) -> {
                 if(student.getGradeLevel()>=3){
                     c3.andThen(c4).accept(student);
                 }
         }
                 );


        //studentList.forEach(c3.andThen(c4));

    }

    public static void main(String[] args) {

        //printName();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();

        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("something");

        // calling using lambda

        Consumer<String> consumer1 = (s) -> System.out.println(s.toUpperCase());

        consumer1.accept("hello");*/


    }
}
