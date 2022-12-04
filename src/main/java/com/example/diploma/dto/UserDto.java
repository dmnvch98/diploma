package com.example.diploma.dto;

import com.example.diploma.entities.LanguageLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class UserDto {
    String email;
    String password;
    String firstName;
    String lastName;
    Date createdAt;
    List<LanguageLevel> languagesSpeaks;
    String nationality;
    String location;
}
