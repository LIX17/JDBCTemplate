package com.LYX.jdbcTemplate.dao;

import java.util.List;
import java.util.Optional;

import com.LYX.jdbcTemplate.entity.Employee;

public interface EmployeeDao {

	List<Employee> findAll();
	int addEmployee(Employee employee);
	Optional<Employee> findById(int id);
	int deleteEmployee(int id);
	int updateEmployee(int id, Employee employee);

}
