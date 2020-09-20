package com.sumitaccess007.repositories;

import com.sumitaccess007.entities.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    List<Employee> findBySalaryIsGreaterThanEqual(double salary, Sort sort);
}
