package com.suvendu.EmployeeMgmt;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController {
       // List<Employee> employees=new ArrayList<>();
       //Dependency Injection
       @Autowired
       EmployeeService employeeService;
             // EmployeeService employeeService=new EmployeeServiceImpl();

    @GetMapping("employees")
    public List<Employee> getAllEmployee() {
       return employeeService.reedEmployees();
    }
    
    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {
   

        return employeeService.createEmpoloyee(employee);
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id))
            return "Delete Successfully";
        return "Not Found";

    }
    
}
