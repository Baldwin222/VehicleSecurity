package com.vehiclesecurity.Vehicle.Security.Repository;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Device;
import com.vehiclesecurity.Vehicle.Security.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    Device findByName (String name);

}
