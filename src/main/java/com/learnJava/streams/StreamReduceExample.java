package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class StreamReduceExample {

    public static Optional<Student> getHigeshGPAStudent(){
      return   StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->
                        (s1.getGpa()>s2.getGpa() ? s1:s2));
    }

    public static int multiply(List<Integer> integerList){
      return   integerList.stream()
        .reduce(1,(a,b) -> a*b);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(multiply(integers));

        Optional<Student> studentOptional = getHigeshGPAStudent();
        if(getHigeshGPAStudent().isPresent()){
            System.out.println(studentOptional.get());
        }

    }
}
