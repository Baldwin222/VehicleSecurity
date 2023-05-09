package com.vehiclesecurity.Vehicle.Security.Controller;

import com.vehiclesecurity.Vehicle.Security.Controller.Request.WarningRequest;
import com.vehiclesecurity.Vehicle.Security.Domain.dto.WarningDto;
import com.vehiclesecurity.Vehicle.Security.Service.WarningService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("warning")
@Slf4j
public class WarningController {

    private final WarningService warningService;

    public WarningController(WarningService warningService) {
        this.warningService = warningService;
    }

    @PostMapping("process")
    public ResponseEntity<?> processWarning(@RequestBody WarningRequest request) {
        log.info("/warning/process POST called with parameters " + request);

        warningService.processWarning(new WarningDto(request.deviceId(), request.location(), request.intensity(), LocalDateTime.now()));

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
