package config;
import org.springframework.context.annotation.Bean;
import parrot.Parrot;
import org.springframework.context.annotation.Configuration;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        return new Parrot("Pbzin");
    }

    @Bean
    @Primary
    Parrot parrot2(){
        return new Parrot("Caio");
    }

    @Bean
    Parrot parrot3(){
        return new Parrot("Caduco");
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
