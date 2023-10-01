package com.hms.Hospital.Management.System.Services;

import com.hms.Hospital.Management.System.Payload.PatientDto;

import java.util.List;

public interface PatientService {
    PatientDto createPatient(PatientDto  patientDto);

    List<PatientDto> getAllPatients();

    PatientDto getPatientById(Integer patientId);

    PatientDto updatePatient(PatientDto patientDto ,Integer patientId);

    void deletePatient(Integer patientId);
}
