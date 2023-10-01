package com.hms.Hospital.Management.System.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="patients")
public class Patient {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;

        private String email;

        private String phoneNumber;

        @ManyToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Appointment> appointments;

    }


