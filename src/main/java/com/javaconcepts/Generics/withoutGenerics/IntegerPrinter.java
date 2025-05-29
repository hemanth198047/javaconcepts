package com.javaconcepts.Generics.withoutGenerics;

public class IntegerPrinter {
    Integer intNumber;

    public IntegerPrinter(Integer intNumber) {
        this.intNumber = intNumber;
    }

    public void print() {
        System.out.println(this.intNumber);
    }
}
