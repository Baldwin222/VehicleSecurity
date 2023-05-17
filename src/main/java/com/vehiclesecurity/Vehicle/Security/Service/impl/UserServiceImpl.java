package com.vehiclesecurity.Vehicle.Security.Service.impl;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.User;
import com.vehiclesecurity.Vehicle.Security.Repository.UserRepository;
import com.vehiclesecurity.Vehicle.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return "Username already taken";
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "Email already registered";
        }

        userRepository.save(user);

        return "Registration successful";
    }
}
