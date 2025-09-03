package com.example.Practice;
import parrot.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.ProjectConfig;

public class PracticeApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        /*System.out.println(p.getName());*/
    }
}