package com.vehiclesecurity.Vehicle.Security.Domain.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "warning", schema = "main")
@Data
public class Warning {

    @Id
    @SequenceGenerator(name = "warning_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warning_seq")
    private Long id;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "location")
    private String location;

    @Column(name = "intensity")
    private Long intensity;

    @Column(name = "input_date_time")
    private LocalDateTime inputDateTime;

}
