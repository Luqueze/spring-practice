package com.example.Practice;
import parrot.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PracticeApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot p = new Parrot();
    }
}