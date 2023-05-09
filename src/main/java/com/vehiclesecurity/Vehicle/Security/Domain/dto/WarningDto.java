package com.vehiclesecurity.Vehicle.Security.Domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class WarningDto {

    private String deviceId;
    private String location;
    private Long intensity;
    private LocalDateTime inputDateTime;

}
