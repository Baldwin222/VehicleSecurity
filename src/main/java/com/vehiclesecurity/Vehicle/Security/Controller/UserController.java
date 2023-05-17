package com.vehiclesecurity.Vehicle.Security.Controller;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.User;
import com.vehiclesecurity.Vehicle.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        String registrationResult = userService.registerUser(user);

        if (registrationResult.startsWith("Error")) {
            return ResponseEntity.badRequest().body(registrationResult);
        }

        return ResponseEntity.ok(registrationResult);
    }
}
