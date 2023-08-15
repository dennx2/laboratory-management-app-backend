package com.humber.laboratorymgntappbackend.repositories;

import com.humber.laboratorymgntappbackend.models.TestOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TestOrderRepository extends JpaRepository<TestOrder, Integer> {

}
