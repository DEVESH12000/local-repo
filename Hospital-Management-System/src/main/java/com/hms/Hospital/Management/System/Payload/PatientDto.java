package com.hms.Hospital.Management.System.Payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientDto {

        private int id;

        private String name;

        private String email;

        private String phoneNumber;
    }


