package main;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfigClass {

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Parapara");
        return p;
    }
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
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
