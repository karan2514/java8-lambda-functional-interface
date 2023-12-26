package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;


    BiConsumer<String, List<String>> studenBiConsumer = (name,activities)-> System.out.println(name +"   "+activities);

    Consumer<Student> studentConsumer = (student) -> {
        if (p1.and(p2).test(student)){
            studenBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students){
students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
List<Student> studentList = StudentDataBase.getAllStudents();
new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}