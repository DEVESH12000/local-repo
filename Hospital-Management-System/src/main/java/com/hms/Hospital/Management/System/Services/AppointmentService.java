package com.hms.Hospital.Management.System.Services;

import com.hms.Hospital.Management.System.Entity.Appointment;
import com.hms.Hospital.Management.System.Payload.AppointmentDto;

import java.util.List;

public interface AppointmentService {

        AppointmentDto getAppointmentById(Long id);

        List<AppointmentDto> getAllAppointments();

        AppointmentDto createAppointment(AppointmentDto appointmentDTO);

        AppointmentDto updateAppointment(Long id, AppointmentDto appointmentDTO);

        void deleteAppointment(Long id);
    }
