package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student david = new Student(
                    "David",
                    LocalDate.of(1998, Month.JULY, 25),
                    "david007@gamil.com"
            );
            Student kate = new Student(
                    "Kate",
                    LocalDate.of(1999, Month.JANUARY, 23),
                    "kate20@gamil.com"
            );
            Student alicja = new Student(
                    "Alicja",
                    LocalDate.of(2001, Month.DECEMBER, 21),
                    "alicja@gamil.com"
            );
            studentRepository.saveAll(
                    List.of(david, kate, alicja)
            );
        };



    }



}
