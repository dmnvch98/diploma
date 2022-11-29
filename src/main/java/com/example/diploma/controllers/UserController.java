package com.example.diploma.controllers;

import com.example.diploma.converter.UserConverter;
import com.example.diploma.dto.UserDto;
import com.example.diploma.entities.User;
import com.example.diploma.entities.utility.Language;
import com.example.diploma.entities.utility.LanguageLevel;
import com.example.diploma.entities.utility.Level;
import com.example.diploma.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserConverter userConverter;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> createUser(@RequestBody final UserDto userDto) {
        userService.save(userConverter.userDtoToUser(userDto));
        return ResponseEntity.ok(userDto);
    }
    @GetMapping
    public ResponseEntity<UserDto> getUser() {
        User user = new User();
        user.setPassword("password");
        user.setEmail("email@gmail.com");
        user.setCreatedAt(new Date());
        user.setFirstName("Yauhen");
        LanguageLevel languageLevel1 = new LanguageLevel();
        languageLevel1.setLanguage(Language.Belorussian);
        languageLevel1.setLevel(Level.B2);

        LanguageLevel languageLevel2 = new LanguageLevel();
        languageLevel2.setLanguage(Language.English);
        languageLevel2.setLevel(Level.B1);

        List<LanguageLevel> languageSpeaks = List.of(languageLevel1, languageLevel2);
        user.setLanguagesSpeaks(languageSpeaks);
        user.setLocation("Minsk");
        user.setNationality("Belarus");
        user.setLastName("Dzemyanovich");
        userService.save(user);
        return ResponseEntity.ok(userConverter.userToUserDto(user));
    }
}
