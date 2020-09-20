package com.sumitaccess007;

import com.sumitaccess007.entities.Employee;
import com.sumitaccess007.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@SpringBootTest
class SpringBootDataModuleSortingImplementationApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void shouldSortDataAsAscending_Success() {
        Iterable<Employee> iterable = employeeRepository.findAll(Sort.by(Sort.Order.asc("name")));
        iterable.forEach(employee -> System.out.println(employee.getName()+", "+employee.getSalary()));

    }

    @Test
    void shouldSortDataAsDescendingBaseOnEmployeeSalary_Success() {
        List<Employee> employeeList = employeeRepository.findBySalaryIsGreaterThanEqual(3000,Sort.by(Sort.Order.desc("salary")));
        employeeList.forEach(employee -> System.out.println(employee.getName()+", "+employee.getSalary()));

    }

}
