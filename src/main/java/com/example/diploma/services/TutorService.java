package com.example.diploma.services;

import com.example.diploma.entities.Tutor;
import com.example.diploma.repositories.TutorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class TutorService {
    private final TutorRepository tutorRepository;

    public Tutor save(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public Tutor getTutorById(final long id) {
        return tutorRepository.findById(id).orElse(null);
    }
}
