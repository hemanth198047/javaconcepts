package com.javaconcepts.Generics.withGenerics;

public class Test {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>();
        Printer<Double> doublePrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();

        integerPrinter.print(10);
        doublePrinter.print(33.5);
        stringPrinter.print("20");
    }
}
