package com.humber.laboratorymgntappbackend.services;

import com.humber.laboratorymgntappbackend.models.TestResult;
import com.humber.laboratorymgntappbackend.repositories.TestResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestResultService {

    private final TestResultRepository testResultRepository;

    @Autowired
    public TestResultService(TestResultRepository testResultRepository) {
        this.testResultRepository = testResultRepository;
    }
    public List<TestResult> getAllTestResults() {
        return testResultRepository.findAll();
    }
    public TestResult searchByResultId(int resultId) {
        Optional<TestResult> resultOptional = testResultRepository.findById(resultId);
        return resultOptional.orElse(null);
    }
}
