package com.daviddutra.streams;

import java.util.Comparator;
import java.util.List;

public class StreamsExamples {

    public static StreamsExamples getInstance(StreamsExamples streamsExamples) {
        if (streamsExamples == null) {
            return new StreamsExamples();
        } else {
            return streamsExamples;
        }
    }

    public void filter(List<Integer> values, Integer param) {
        System.out.println("Filter: i -> i > param");
        values.stream().filter(i -> i > param).forEach(System.out::println);
    }

    public void sorted(List<Integer> values) {
        System.out.println("Sorted: (obj1, obj2) -> obj1.compareTo(obj2)");
        Comparator<Integer> asc = (obj1, obj2) -> obj1.compareTo(obj2);
        values.stream().sorted(asc).forEach(System.out::println);
    }

    public void map(List<Integer> values, Integer param) {
        System.out.println("Map: i -> { return i > param ? \">\" : \"<\";}");
        values.stream().map(i -> {
            return i > param ? ">" : "<";
        }).forEach(System.out::println);
    }

    public void findFirst(List<Integer> values) {
        System.out.println("findFirst");
        values.stream().findFirst().ifPresent(System.out::println);
    }

    public void distinct(List<Integer> values) {
        System.out.println("distinct: ");
        values.stream().distinct().forEach(System.out::println);
    }

}
