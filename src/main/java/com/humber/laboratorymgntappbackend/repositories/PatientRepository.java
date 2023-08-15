package com.humber.laboratorymgntappbackend.repositories;

import com.humber.laboratorymgntappbackend.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
