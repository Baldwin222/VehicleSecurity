package com.vehiclesecurity.Vehicle.Security.Domain.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "devices")
@Data
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "device_id")
    private String name;

    @Column(name = "user")
    @ManyToOne(targetEntity = User.class)
    private User user;
}