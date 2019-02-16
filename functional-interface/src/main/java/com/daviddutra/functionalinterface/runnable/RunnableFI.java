package com.daviddutra.functionalinterface.runnable;

public class RunnableFI {

    public static void main(String[] args) {

        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Normal runnable");
            }
        };

        Runnable lambdaRunnable = () -> System.out.println("Lamba runnable");

        runnable.run();
        lambdaRunnable.run();
    }

}
