package com.example.diploma.services;

import com.example.diploma.entities.User;
import com.example.diploma.repositories.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User getUser(final long id) {
        return userRepository.findById(id).orElse(null);
    }
}
