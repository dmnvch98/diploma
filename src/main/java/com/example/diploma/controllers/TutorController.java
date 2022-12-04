package com.example.diploma.controllers;

import com.example.diploma.entities.Tutor;
import com.example.diploma.services.TutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tutors")
@RequiredArgsConstructor
public class TutorController {

    private final TutorService tutorService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tutor> createTutor(@RequestBody final Tutor tutor) {
        return ResponseEntity.ok(tutorService.save(tutor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutor> getTutor(@PathVariable("id") long id) {
        return ResponseEntity.ok(tutorService.getTutorById(id));
    }
}
