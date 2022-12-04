package com.example.diploma.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Embeddable
public class LanguageLevel {
    long languageId;
    long levelId;
}
