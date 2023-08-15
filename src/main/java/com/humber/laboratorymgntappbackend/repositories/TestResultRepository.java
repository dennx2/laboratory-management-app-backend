package com.humber.laboratorymgntappbackend.repositories;

import com.humber.laboratorymgntappbackend.models.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TestResultRepository extends JpaRepository<TestResult, Integer> {

}
