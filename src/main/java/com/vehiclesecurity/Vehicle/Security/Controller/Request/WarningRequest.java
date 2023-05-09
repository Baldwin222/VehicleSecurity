package com.vehiclesecurity.Vehicle.Security.Controller.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record WarningRequest(
        @JsonProperty("device_id")
        String deviceId,
        @JsonProperty("location")
        String location,
        @JsonProperty("intensity")
        Long intensity
) {
}
