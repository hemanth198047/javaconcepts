package com.javaconcepts.Generics.withoutGenerics;

public class DoublePrinter {
    Double doubleNumber;

    public DoublePrinter(Double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void print() {
        System.out.println(this.doubleNumber);
    }
}
