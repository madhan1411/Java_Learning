package com.example.hospital_crud.controllers;

import com.example.hospital_crud.models.Appointment;
import com.example.hospital_crud.models.Patient;
import com.example.hospital_crud.models.Practitioner;
import com.example.hospital_crud.repositories.AppointmentRepository;
import com.example.hospital_crud.repositories.PatientRepository;
import com.example.hospital_crud.repositories.PractitionerRepisotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PractitionerRepisotory practitionerRepisotory;


    @GetMapping
    @RequestMapping("appointments")
    public List<Appointment> get() {
        return this.appointmentRepository.findAll();
    }

    @PostMapping("/patient/{patient_id}/practitioner/{practitioner_id}")
    public Appointment create(@PathVariable(value = "patient_id") Long patientId, @PathVariable(value = "practitioner_id") Long practitionerId, @RequestBody final Appointment appointment) {
        Patient patient = patientRepository.findById(patientId).get();
        Practitioner practitioner = practitionerRepisotory.findById(practitionerId).get();
        Appointment appointment1 = new Appointment();
        appointment1.setAppointmentStartTime(appointment.getAppointmentStartTime());
        appointment1.setAppointmentEndTime(appointment.getAppointmentEndTime());
        appointment1.setPatient(patient);
        appointment1.setPractitioner(practitioner);

        return appointmentRepository.save(appointment1);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        appointmentRepository.deleteById(id);
    }

    @PutMapping(value = "/{appointment_id}/patient/{patient_id}/practitioner/{practitioner_id}")
    public Appointment update(@PathVariable(value = "appointment_id") Long appointmentId, @PathVariable(value = "patient_id") Long patientId,
                              @PathVariable(value = "practitioner_id") Long practitionerId, @RequestBody final Appointment appointment) {
        Patient patient = patientRepository.findById(patientId).get();
        Practitioner practitioner = practitionerRepisotory.findById(practitionerId).get();
        Appointment appointment1 = appointmentRepository.findById(appointmentId).get();
        appointment1.setAppointmentStartTime(appointment.getAppointmentStartTime());
        appointment1.setAppointmentEndTime(appointment.getAppointmentEndTime());
        appointment1.setPatient(patient);
        appointment1.setPractitioner(practitioner);

        return appointmentRepository.save(appointment1);
    }
}
