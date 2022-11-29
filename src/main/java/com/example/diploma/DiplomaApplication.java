package com.example.diploma;

import com.example.diploma.entities.User;
import com.example.diploma.entities.utility.Language;
import com.example.diploma.entities.utility.LanguageLevel;
import com.example.diploma.entities.utility.Level;
import com.example.diploma.repositories.UserRepository;
import com.example.diploma.services.UserService;
import com.sun.tools.javac.Main;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DiplomaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiplomaApplication.class, args);
    }
}