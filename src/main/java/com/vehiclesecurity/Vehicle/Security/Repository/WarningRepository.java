package com.vehiclesecurity.Vehicle.Security.Repository;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Warning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarningRepository extends JpaRepository<Warning,Long> {

}
