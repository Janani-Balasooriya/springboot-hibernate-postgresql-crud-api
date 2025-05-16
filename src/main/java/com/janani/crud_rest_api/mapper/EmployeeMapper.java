package com.janani.crud_rest_api.mapper;

import com.janani.crud_rest_api.dto.EmployeeDTO;
import com.janani.crud_rest_api.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
                );
    }

    public static Employee mapToEmployeeEntity(EmployeeDTO employeeDTO){
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }

}
