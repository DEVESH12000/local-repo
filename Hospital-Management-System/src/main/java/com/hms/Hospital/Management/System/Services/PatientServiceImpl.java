package com.hms.Hospital.Management.System.Services;

import com.hms.Hospital.Management.System.Entity.Patient;
import com.hms.Hospital.Management.System.Exception.ResourceNotFoundException;
import com.hms.Hospital.Management.System.Payload.PatientDto;
import com.hms.Hospital.Management.System.Repository.PatientRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientRepo patientRepo;
    @Autowired
    private ModelMapper modelMapper;
    //DTO to Entity
    private Patient dtoToPatient (PatientDto patientDto){
        Patient patient =this.modelMapper.map(patientDto,Patient.class);
        return patient;
    }
    //ENTITY to DTO
    private PatientDto patientToDto (Patient patient){
        PatientDto  patientDto =this.modelMapper.map(patient,PatientDto.class);
        return patientDto;
    }


    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient=this.dtoToPatient(patientDto);
        Patient savedPatient=this.patientRepo.save(patient);
        return this.patientToDto(savedPatient);


    }

    @Override
    public List<PatientDto> getAllPatients() {
        List<Patient> patients = this.patientRepo.findAll();
        return patients.stream().map(patient -> this.patientToDto(patient)).collect(Collectors.toList());

    }

    @Override
    public PatientDto getPatientById(Integer patientId) {
        Patient patient = this.patientRepo.findById(patientId).orElseThrow(() -> new ResourceNotFoundException("Patient", "id", patientId));
        return this.patientToDto(patient);
    }

    @Override
    public PatientDto updatePatient(PatientDto patientDto, Integer patientId) {
        Patient patient = this.patientRepo.findById(patientId).orElseThrow(() -> new ResourceNotFoundException("Patient", "patientid", patientId));
        patient.setEmail(patientDto.getEmail());
        patient.setPhoneNumber(patientDto.getPhoneNumber());
       Patient  updatePatient = this.patientRepo.save(patient);
       return this.modelMapper.map(updatePatient,PatientDto.class);

    }

    @Override
    public void deletePatient(Integer patientId) {
        Patient patient = this.patientRepo.findById(patientId).orElseThrow(() -> new ResourceNotFoundException("Patient", "patientid", patientId));
        this.patientRepo.delete(patient);

    }

}
