package com.sumitaccess007.repositories;

import com.sumitaccess007.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
}
