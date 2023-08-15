package com.humber.laboratorymgntappbackend.controllers;

import com.humber.laboratorymgntappbackend.models.TestResult;
import com.humber.laboratorymgntappbackend.services.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test-results")
public class TestResultController {

    private final TestResultService testResultService;

    @Autowired
    public TestResultController(TestResultService testResultService) {
        this.testResultService = testResultService;
    }

    @GetMapping("/view-all")
    public List<TestResult> viewAllResults() {
        return testResultService.getAllTestResults();
    }
    @GetMapping("/search/resultid/{resultId}")
    public ResponseEntity<TestResult> searchByResultId(@PathVariable int resultId) {
        TestResult testResult = testResultService.searchByResultId(resultId);

        if (testResult != null) {
            return ResponseEntity.ok(testResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
