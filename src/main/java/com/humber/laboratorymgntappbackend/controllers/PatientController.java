package com.humber.laboratorymgntappbackend.controllers;

import com.humber.laboratorymgntappbackend.models.Patient;
import com.humber.laboratorymgntappbackend.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/patient-info")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/view-all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/search/patientid/{patientId}")
    public ResponseEntity<Patient> searchByPatientId(@PathVariable int patientId) {
        Patient patient = patientService.searchByPatientId(patientId);

        if (patient != null) {
            return ResponseEntity.ok(patient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @PutMapping("/update/{patientId}")
    public Patient updatePatient(@PathVariable int patientId, @RequestBody Patient updatedPatient) {
        return patientService.updatePatient(patientId, updatedPatient);
    }

}
