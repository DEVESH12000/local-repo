package com.hms.Hospital.Management.System.Repository;

import com.hms.Hospital.Management.System.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
