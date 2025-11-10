package com.example.employee.controller;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    @PostMapping("/post")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmpl= employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmpl, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeById = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeById);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<EmployeeDto>> getALlEmployees(){
        List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.ok(allEmployees);
    }

    @PutMapping("{eId}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long eId,  @RequestBody EmployeeDto employeeDto){
        EmployeeDto employeeDto1 = employeeService.updateEmployee(eId, employeeDto);
        return ResponseEntity.ok(employeeDto1);
    }

    @DeleteMapping("{eId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long eId){
        employeeService.deleteEmployeeById(eId);
        return ResponseEntity.ok("Employee deleted successfully");
    }

}
