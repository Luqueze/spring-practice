package config;
import org.springframework.context.annotation.Bean;
import parrot.Parrot;
import org.springframework.context.annotation.Configuration;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        return new Parrot("Pbzin");
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }


}
