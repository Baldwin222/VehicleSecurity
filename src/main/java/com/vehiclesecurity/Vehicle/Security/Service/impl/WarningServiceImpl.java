package com.vehiclesecurity.Vehicle.Security.Service.impl;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Warning;
import com.vehiclesecurity.Vehicle.Security.Domain.dto.WarningDto;
import com.vehiclesecurity.Vehicle.Security.Repository.WarningRepository;
import com.vehiclesecurity.Vehicle.Security.Service.WarningService;
import com.vehiclesecurity.Vehicle.Security.Util.Factory.WarningFactory;
import org.springframework.stereotype.Service;

@Service
public class WarningServiceImpl implements WarningService {

    private final WarningRepository warningRepository;

    public WarningServiceImpl(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    @Override
    public void processWarning(WarningDto warningDto) {

        Warning warning = WarningFactory.build(warningDto);

        //send_notification

        warningRepository.save(warning);

    }

}
