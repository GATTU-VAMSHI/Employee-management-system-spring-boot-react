package com.example.employee.service;

import com.example.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long eId,EmployeeDto updatedEmployee);

    void deleteEmployeeById(Long eId);
}
