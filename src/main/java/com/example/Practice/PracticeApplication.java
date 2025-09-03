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

        Parrot p1 = context.getBean("parrot1",Parrot.class);
        System.out.println(p1.name());

        Parrot p2 = context.getBean("parrot2",Parrot.class);
        System.out.println(p2.name());

        Parrot p3 = context.getBean("parrot3",Parrot.class);
        System.out.println(p3.name());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

    }
}