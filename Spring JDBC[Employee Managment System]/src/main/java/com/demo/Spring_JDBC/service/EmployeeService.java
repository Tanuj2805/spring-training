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

    @Autowired
    EmployeeRepo emprepo;



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

    public void empupdate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id:(ID must be same other data can be changed) ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Salary: ");
        int sal = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Position: ");
        String pos = sc.nextLine();

        emprepo.update(id,name,sal,pos);
    }
}
