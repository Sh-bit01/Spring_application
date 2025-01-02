package com.example.demo.service;

import com.example.demo.model.Employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;  // Ensure this is present


@Service
public class EmployeeService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees() {
        String sql = "SELECT eid, ename, designation, address FROM EMPLOYEES";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Employee employee = new Employee();
            employee.setEmployeeId(rs.getInt("eid"));
            employee.setFirstName(rs.getString("ename"));
            employee.setLastName(rs.getString("designation"));
            employee.setEmail(rs.getString("address"));

            return employee;
        });
    }
}

