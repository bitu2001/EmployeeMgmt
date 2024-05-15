package com.suvendu.EmployeeMgmt;

import java.util.List;

public interface EmployeeService {
 String createEmpoloyee(Employee employee);
List<Employee> reedEmployees();
boolean deleteEmployee(Long id);

}
