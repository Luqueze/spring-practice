package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import parrot.Parrot;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan(basePackages = {"com.example.Practice", "parrot"})
public class ProjectConfig {

    Parrot parrot1(){
        return new Parrot("Pbzin");
    }

    Parrot parrot2(){
        return new Parrot("Caio");
    }

    Parrot parrot3(){
        return new Parrot("Caduco");
    }

    String hello(){
        return "Hello";
    }

    Integer ten(){
        return 10;
    }


}
