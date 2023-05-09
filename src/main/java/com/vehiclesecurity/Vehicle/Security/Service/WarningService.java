package com.vehiclesecurity.Vehicle.Security.Service;

import com.vehiclesecurity.Vehicle.Security.Domain.dto.WarningDto;

public interface WarningService {

    void processWarning(WarningDto warningDto);
}
