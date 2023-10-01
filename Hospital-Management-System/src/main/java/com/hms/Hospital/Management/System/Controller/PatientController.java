package com.hms.Hospital.Management.System.Controller;


import com.hms.Hospital.Management.System.Payload.ApiResponse;
import com.hms.Hospital.Management.System.Payload.PatientDto;
import com.hms.Hospital.Management.System.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    // create blog post rest api
    @PostMapping("/")
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto) {
        return new ResponseEntity<>(patientService.createPatient(patientDto), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<PatientDto> getAllPatients() {

        return patientService.getAllPatients();
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<PatientDto> getPatientById(@PathVariable Integer patientId) {
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

    @PutMapping("/{patientId}")
    public ResponseEntity<PatientDto> updatePatient(@RequestBody PatientDto patientDto,
                                                    @PathVariable Integer patientId) {
        PatientDto UpdatepatientDto = this.patientService.updatePatient(patientDto, patientId);
return  new ResponseEntity<PatientDto>(UpdatepatientDto,HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ApiResponse deletePatient(@PathVariable Integer patientId){
        this.patientService.deletePatient(patientId);
        return new ApiResponse("Patient deleted successfully.",true);
    }
}