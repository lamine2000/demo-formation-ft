package com.sn.finetech.finetechapp.repositories;

import com.sn.finetech.finetechapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<List<Department>> findByName(String name);
    Optional<List<Department>> findByCode(String code);
    Optional<Department> findById(Long id);
}
