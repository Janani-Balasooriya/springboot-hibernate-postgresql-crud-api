package com.janani.crud_rest_api.service.impl;

import com.janani.crud_rest_api.dto.EmployeeDTO;
import com.janani.crud_rest_api.entity.Employee;
import com.janani.crud_rest_api.mapper.EmployeeMapper;
import com.janani.crud_rest_api.repository.EmployeeRepository;
import com.janani.crud_rest_api.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = EmployeeMapper.mapToEmployeeEntity(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
}
