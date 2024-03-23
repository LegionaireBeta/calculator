package com.example.calculator1.repositories;

import com.example.calculator1.models.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    Optional<Operation> findTopByOrderByOperationIdDesc();
}
