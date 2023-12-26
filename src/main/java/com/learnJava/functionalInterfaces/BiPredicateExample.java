package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {
    BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println("name of the student: "+ name+" Activities of the student"+activities);
    Consumer<Student> studentConsumer = (student) -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivities(studentList);
    }
}
