package com.hms.Hospital.Management.System.Services;
import com.hms.Hospital.Management.System.Payload.AppointmentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{


    @Override
    public AppointmentDto getAppointmentById(Long id) {
        return null;
    }

    @Override
    public List<AppointmentDto> getAllAppointments() {
        return null;
    }

    @Override
    public AppointmentDto createAppointment(AppointmentDto appointmentDTO) {
        return null;
    }

    @Override
    public AppointmentDto updateAppointment(Long id, AppointmentDto appointmentDTO) {
        return null;
    }

    @Override
    public void deleteAppointment(Long id) {

    }
}
