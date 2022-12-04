package com.example.diploma.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    long id;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "createdAt")
    Date createdAt;
    @ElementCollection
    Set<LanguageLevel> languagesSpeaks;
    @Column(name = "nationality")
    String nationality;
    @Column(name = "location")
    String location;
}
