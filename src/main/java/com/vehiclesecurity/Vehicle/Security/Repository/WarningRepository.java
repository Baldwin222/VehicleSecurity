package com.vehiclesecurity.Vehicle.Security.Repository;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.Warning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarningRepository extends JpaRepository<Warning,Long> {

}
