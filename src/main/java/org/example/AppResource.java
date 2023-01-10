package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public String home(){
        return "Welcome home !!";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/create/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
