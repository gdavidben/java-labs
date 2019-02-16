package com.daviddutra.functionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorFI {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = integer -> integer * 2;

        operation(2, unaryOperator);
    }

    private static void operation(Integer value, UnaryOperator operator) {
        System.out.println(operator.apply(value));
    }

}
