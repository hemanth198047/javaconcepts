package com.javaconcepts;

import org.springframework.boot.SpringApplication;

public class TestJavaconceptsApplication {

    public static void main(String[] args) {
        SpringApplication.from(JavaconceptsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
