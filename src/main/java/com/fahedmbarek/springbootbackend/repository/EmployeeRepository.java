package com.fahedmbarek.springbootbackend.repository;

import com.fahedmbarek.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
