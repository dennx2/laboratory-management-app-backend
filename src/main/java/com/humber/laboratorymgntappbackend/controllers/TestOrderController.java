package com.humber.laboratorymgntappbackend.controllers;

import com.humber.laboratorymgntappbackend.models.TestOrder;
import com.humber.laboratorymgntappbackend.services.TestOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/test-orders")
public class TestOrderController {

}
