package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student amara= new Student(
                    1L,
                    "Amara",
                    LocalDate.of(2000, MAY, 3),
                    "amara@gmail.com"
            );
            Student yohan= new Student(
                    "Yohan",
                    LocalDate.of(2002, AUGUST, 11),
                    "yohan@gmail.com"
            );

            repository.saveAll(
                    List.of()
            );
        };
    }
}
