package hlieb;

import java.time.LocalDate;

import hlieb.model.Person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirsoftNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirsoftNetworkApplication.class, args);
        Person p3 = new Person();
        System.out.println(p3.toString());
        
            
    }
}
