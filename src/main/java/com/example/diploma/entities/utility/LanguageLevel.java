package com.example.diploma.entities.utility;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Table
@Entity
public class LanguageLevel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    long id;
    @Column(name = "language")
    Language language;
    @Column(name = "level")
    Level level;
}
