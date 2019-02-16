package com.daviddutra.functionalinterface.binaryoperator;


import java.util.function.BinaryOperator;

public class BinaryOperatorFI {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> {
            return integer * integer2;
        };

        operation(10, 20, binaryOperator);
    }

    private static void operation(Integer v1, Integer v2, BinaryOperator binaryOperator) {
        System.out.println(binaryOperator.apply(v1, v2));
    }

}
