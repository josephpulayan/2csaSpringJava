package com.csa.samplefullstack.Controllers;

import com.csa.samplefullstack.entity.Employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
     
    @Autowired 
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping("/employees")
    public Employee postEmploye(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
       @GetMapping("/employees/{id}")
    public Employee getEmployeeFromId(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }
     @PutMapping("/employees")
    public Employee putEmploye(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    
            
}
