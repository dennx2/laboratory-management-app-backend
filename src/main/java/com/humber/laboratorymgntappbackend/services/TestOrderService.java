package com.humber.laboratorymgntappbackend.services;

import com.humber.laboratorymgntappbackend.models.TestOrder;
import com.humber.laboratorymgntappbackend.repositories.TestOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TestOrderService {

    private final TestOrderRepository testOrderRepository;
    @Autowired
    public TestOrderService(TestOrderRepository testOrderRepository) {
        this.testOrderRepository = testOrderRepository;
    }

}
