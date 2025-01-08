package com.demo.Spring_JDBC.repositery;

import com.demo.Spring_JDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeRepo {



    @Autowired
    public void save(Employee emp)
    {

        System.out.println(emp.getName()+" HAS BEEN ADDED");

    }


    public List<Employee> viewAllEmployee()
    {
        List<Employee> employees = new ArrayList<Employee>();
        return employees;
    }
}
