package com.vehiclesecurity.Vehicle.Security.Domain.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Device> devices = new ArrayList<>();

    @Column(name = "send_notification")
    private boolean sendNotification;

    public void addDevice(Device device) {
        devices.add(device);
        device.setUser(this);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
        device.setUser(null);
    }
}