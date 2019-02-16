package com.daviddutra.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExamples {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10, 90, 20, 80, 30, 70, 40, 60, 50);

        filter(values);
        sorted(values);
        map(values);
        findFirst(values);
    }

    public static void filter(List<Integer> values) {
        Predicate<Integer> predicate = i -> i > 18;
        System.out.println("Filter: ");
        values.stream().filter(predicate).forEach(System.out::println);
    }

    public static void sorted(List<Integer> values) {
        Comparator<Integer> comparator = (obj1, obj2) -> obj1.compareTo(obj2);
        System.out.println("Sorted: ");
        values.stream().sorted(comparator).forEach(System.out::println);
    }

    public static void map(List<Integer> values) {
        Function<Integer, String> function = (i) -> {
            return (i > 50) ? ">50" : "<50";
        };
        System.out.println("Map: ");
        values.stream().map(function).forEach(System.out::println);
    }

    public static void findFirst(List<Integer> values) {
        System.out.println("findFirst: ");
        values.stream().findFirst().ifPresent(System.out::println);
    }

}
