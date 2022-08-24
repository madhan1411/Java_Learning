package com.example.hospital_crud.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity(name = "appointment")
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Time appointmentstarttime;
    private Time appointmentendtime;

    @ManyToOne
    @JoinColumn(name = "patient", referencedColumnName = "id")
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @ManyToOne
    @JoinColumn(name = "practitioner", referencedColumnName = "id")
    private Practitioner practitioner;

    public Practitioner getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(Practitioner practitioner) {
        this.practitioner = practitioner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getAppointmentStartTime() {
        return appointmentstarttime;
    }

    public void setAppointmentStartTime(Time appointmentStartTime) {
        this.appointmentstarttime = appointmentStartTime;
    }

    public Time getAppointmentEndTime() {
        return appointmentendtime;
    }

    public void setAppointmentEndTime(Time appointmentEndTime) {
        this.appointmentendtime = appointmentEndTime;
    }

    public Appointment() {

    }
}
