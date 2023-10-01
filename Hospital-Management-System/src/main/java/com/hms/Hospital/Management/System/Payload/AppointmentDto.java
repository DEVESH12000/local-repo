package com.hms.Hospital.Management.System.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;
    private PatientDto patient;
    private LocalDateTime appointmentDateTime;
    // Add other appointment attributes as needed

    // Constructors, getters, and setters (omitted for brevity)

    // You can define conversion methods to convert between Appointment and AppointmentDTO
}

