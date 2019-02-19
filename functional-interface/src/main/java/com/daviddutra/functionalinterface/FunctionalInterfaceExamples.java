package com.daviddutra.functionalinterface;

import java.util.Comparator;
import java.util.function.*;

public class FunctionalInterfaceExamples {

    public static FunctionalInterfaceExamples getInstance(FunctionalInterfaceExamples functionalInterfaceExamples) {
        if (functionalInterfaceExamples == null) {
            return new FunctionalInterfaceExamples();
        } else {
            return functionalInterfaceExamples;
        }
    }

    public void callBinaryOperator() {
        BinaryOperator<Integer> som = (i1, i2) -> i1 + i2;
        System.out.println(binaryOperator(10, 20, som));
    }

    public void callComparator() {
        Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
        System.out.println(comparator(10, 20, comparator));
    }

    public void callConsumer() {
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer(10, consumer);
    }

    public void callFunction() {
        Function<Integer, Boolean> function = i -> i != null;
        System.out.println(function(20, function));
    }

    public void callPredicate() {
        Predicate<Integer> predicate = i -> {
            return i > 20;
        };
        System.out.println(predicate(10, predicate));
    }

    public void callSupplier() {
        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier(10, supplier));
    }

    public void callUnaryOperator() {
        UnaryOperator<Integer> unaryOperator = i -> i * i;
        System.out.println(unaryOperator(10, unaryOperator));
    }

    public void callRunnable() {
        //runnable();
    }


    private Integer binaryOperator(Integer i1, Integer i2, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(i1, i2);
    }

    private Integer comparator(Integer i1, Integer i2, Comparator<Integer> comparator) {
        return comparator.compare(i1, i2);
    }

    private void consumer(Integer i1, Consumer<Integer> consumer) {
        consumer.accept(i1);
    }

    private Boolean function(Integer i1, Function<Integer, Boolean> function) {
        return function.apply(i1);
    }

    private Boolean predicate(Integer i1, Predicate<Integer> predicate) {
        return predicate.test(i1);
    }

    private Integer supplier(Integer i1, Supplier<Integer> supplier) {
        return supplier.get();
    }

    private Integer unaryOperator(Integer i1, UnaryOperator<Integer> unaryOperator) {
        return unaryOperator.apply(i1);
    }

    private Runnable runnable() {
        return () -> System.out.println("Runnable.");
    }
}
