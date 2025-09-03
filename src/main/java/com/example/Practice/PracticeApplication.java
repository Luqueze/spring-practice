package com.example.Practice;
import parrot.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.ProjectConfig;

@SpringBootApplication
public class PracticeApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.name());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

    }
}