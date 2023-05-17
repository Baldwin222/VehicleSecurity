package com.vehiclesecurity.Vehicle.Security.Repository;

import com.vehiclesecurity.Vehicle.Security.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
    User findByEmail(String email);
}
