package com.vehiclesecurity.Vehicle.Security.Util.Factory;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Warning;
import com.vehiclesecurity.Vehicle.Security.Domain.dto.WarningDto;

public class WarningFactory {

    public static Warning build (WarningDto warningDto){
        Warning warning = new Warning();
        warning.setDeviceId(warningDto.getDeviceId());
        warning.setIntensity(warningDto.getIntensity());
        warning.setLocation(warningDto.getLocation());
        warning.setInputDateTime(warningDto.getInputDateTime());
        return warning;
    }

}
