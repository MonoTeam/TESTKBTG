package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse getById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        if(result.isPresent()) {
            // Map data from entity to response
            EmployeeResponse response = new EmployeeResponse();
            response.setId(result.get().getId());
            response.setName(result.get().getName());
            return response;
        }
        throw new RuntimeException("Employee not found id=" + id);
    }
}
