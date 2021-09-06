package com.example.demo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public EmployeeResponse[] listEmployee() {
    	EmployeeResponse ep1 = new EmployeeResponse();
    	ep1.setId(1);
    	ep1.setName("YES");
    	EmployeeResponse ep2 = new EmployeeResponse();
    	ep2.setId(2);
    	ep2.setName("No");
        return new EmployeeResponse[]{ep1,ep2};
    }
    
}