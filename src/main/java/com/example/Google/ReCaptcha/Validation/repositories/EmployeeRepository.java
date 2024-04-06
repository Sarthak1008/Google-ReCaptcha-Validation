package com.example.Google.ReCaptcha.Validation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Google.ReCaptcha.Validation.entity.EmployeeEntity;

/* Step 5.) Create a Repository Interface for Employee Entity Class */

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}