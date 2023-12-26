package com.learnJava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside run method");
            }
        };
        new Thread(runnable).start();

        // java 8 lambda implementation

        Runnable r = () -> {
            System.out.println("called by lambda");
        };

        new Thread(r).start();

    }
}
