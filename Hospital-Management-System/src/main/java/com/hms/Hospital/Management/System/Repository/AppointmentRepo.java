package com.hms.Hospital.Management.System.Repository;

import com.hms.Hospital.Management.System.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
    // You can define custom queries here if needed
}

