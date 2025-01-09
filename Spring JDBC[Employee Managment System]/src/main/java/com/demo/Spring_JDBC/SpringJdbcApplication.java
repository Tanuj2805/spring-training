package com.demo.Spring_JDBC;


import com.demo.Spring_JDBC.model.Employee;
import com.demo.Spring_JDBC.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeService empserve = context.getBean(EmployeeService.class);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n--- Employee Management System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");


			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
				case 1 ->
				{
					empserve.addemployee();

				}
				case 2 -> {
					List<Employee> employees = empserve.viewAllEmployee();

				}
				//case 3 -> employeeService.updateEmployee(scanner);
				//case 4 -> employeeService.deleteEmployee(scanner);
				case 5 -> {
					System.out.println("Exiting...");
					sc.close();
					System.exit(0);
				}
			}
		}
	}
}
