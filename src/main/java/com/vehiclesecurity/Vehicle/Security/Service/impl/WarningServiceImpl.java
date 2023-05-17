package com.vehiclesecurity.Vehicle.Security.Service.impl;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Device;
import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Warning;
import com.vehiclesecurity.Vehicle.Security.Domain.dto.WarningDto;
import com.vehiclesecurity.Vehicle.Security.Repository.DeviceRepository;
import com.vehiclesecurity.Vehicle.Security.Repository.WarningRepository;
import com.vehiclesecurity.Vehicle.Security.Service.WarningService;
import com.vehiclesecurity.Vehicle.Security.Util.Factory.WarningFactory;
import org.springframework.stereotype.Service;

@Service
public class WarningServiceImpl implements WarningService {

    private final WarningRepository warningRepository;
    private final DeviceRepository deviceRepository;

    public WarningServiceImpl(WarningRepository warningRepository, DeviceRepository deviceRepository) {
        this.warningRepository = warningRepository;
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void processWarning(WarningDto warningDto) {
        Device device = deviceRepository.findByName(warningDto.getDeviceId());
        if(device.getUser().isSendNotification()) {
            Warning warning = WarningFactory.build(warningDto);
            warningRepository.save(warning);
        }
    }

}
