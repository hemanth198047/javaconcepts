package com.javaconcepts.Generics.withoutGenerics;

public class StringPrinter {
    String StringNumber;

    public StringPrinter(String StringNumber) {
        this.StringNumber = StringNumber;
    }

    public void print() {
        System.out.println(this.StringNumber);
    }
}
