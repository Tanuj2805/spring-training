package com.demo.Spring_JDBC.service;


import com.demo.Spring_JDBC.model.Employee;
import com.demo.Spring_JDBC.repositery.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService {

    @Autowired
    Employee emp;


    EmployeeRepo emprepo;

    public EmployeeRepo getEmprepo() {
        return emprepo;
    }
    @Autowired
    public void setEmprepo(EmployeeRepo emprepo) {
        this.emprepo = emprepo;
    }

    public void addemployee()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        emp.setName(scanner.nextLine());

        System.out.println("Enter Employee Id: ");
        emp.setEmp_id(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Enter Employee Position: ");
        emp.setPosition(scanner.nextLine());

        System.out.println("Enter Employee Salary: ");
        emp.setSal(scanner.nextInt());

        emprepo.save(emp);




    }
    public List<Employee> viewAllEmployee()
    {
        return emprepo.viewAllEmployee();
    }
}
