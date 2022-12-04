package com.example.diploma.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Lesson {
    Tutor tutor;
    Student student;
    int lessonTypeId;
    int languageId;
    String location;
    float price;
}
