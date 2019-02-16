package com.daviddutra.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierFI {

    public static void main(String[] args) {
        Supplier<String> supplier1 = () -> {return "Supplier 1"; };

        show(supplier1);
        show(() -> {return "Supplier 2";});
    }

    private static void show(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}
