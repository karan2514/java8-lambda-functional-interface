package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
                //.reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);

    }
    //sum of notebooks for the students who have grade level 3 or above

    private static int noOfNoteBooksGradeLevel() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >=3)
                .map(Student::getNoteBooks)
                //.reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);

    }
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
        System.out.println("students notebooks sum who are in grade level 3 or more : " + noOfNoteBooksGradeLevel());
    }
}
