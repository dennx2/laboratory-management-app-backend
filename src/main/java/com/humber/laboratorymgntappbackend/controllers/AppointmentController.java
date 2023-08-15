package com.humber.laboratorymgntappbackend.controllers;

import com.humber.laboratorymgntappbackend.models.Appointment;
import com.humber.laboratorymgntappbackend.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/view-all")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping("/add")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentService.addAppointment(appointment);
    }
    @GetMapping("/search/appointmentid/{appointmentId}")
    public ResponseEntity<Appointment> searchByAppointmentId(@PathVariable int appointmentId) {
        Appointment appointment = (Appointment) appointmentService.searchByAppointmentId(appointmentId);

        if (appointment != null) {
            return ResponseEntity.ok(appointment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/update/{appointmentId}")
    public Appointment updateAppointment(@PathVariable int appointmentId, @RequestBody Appointment updatedAppointment) {
        return appointmentService.updateAppointment(appointmentId, updatedAppointment);
    }
}
