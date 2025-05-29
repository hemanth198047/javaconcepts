package com.javaconcepts.Generics.withoutGenerics;

public class Test {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(10);
        DoublePrinter doublePrinter = new DoublePrinter(25.5);
        StringPrinter stringPrinter = new StringPrinter("30");

        integerPrinter.print();
        doublePrinter.print();
        stringPrinter.print();
    }
}
