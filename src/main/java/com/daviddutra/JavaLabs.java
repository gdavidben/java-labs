package com.daviddutra;

import com.daviddutra.functionalinterface.FunctionalInterfaceExamples;
import com.daviddutra.streams.StreamsExamples;

import java.util.Arrays;
import java.util.List;

public class JavaLabs {

    private static StreamsExamples streamsExamples;
    private static FunctionalInterfaceExamples functionalInterfaceExamples;

    public static void main(String[] args) {
        streams();
        functionalInterface();
    }

    private static void streams() {
        List<Integer> ints = Arrays.asList(10, 20, 30, 40, 50, 10, 20, 30, 40, 50);

        streamsExamples = StreamsExamples.getInstance(streamsExamples);
        streamsExamples.distinct(ints);
        streamsExamples.findFirst(ints);
        streamsExamples.filter(ints, 20);
        streamsExamples.sorted(ints);
    }

    private static void functionalInterface() {
        functionalInterfaceExamples = FunctionalInterfaceExamples.getInstance(functionalInterfaceExamples);
        functionalInterfaceExamples.callBinaryOperator();
        functionalInterfaceExamples.callComparator();
        functionalInterfaceExamples.callConsumer();
        functionalInterfaceExamples.callFunction();
        functionalInterfaceExamples.callPredicate();
        functionalInterfaceExamples.callSupplier();
    }
}
