package org.example.ex2.Controller;


import org.example.ex2.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/api/v1/employees")
    public List<Employee> getEmployees(){

        return List.of(

                new Employee(1L, "Nguyen Van A", 15000000.0),

                new Employee(2L, "Tran Thi B", 18000000.0),

                new Employee(3L, "Le Van C", 20000000.0)

        );
    }

}
