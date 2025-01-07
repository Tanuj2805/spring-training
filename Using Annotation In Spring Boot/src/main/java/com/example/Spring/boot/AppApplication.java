package com.example.Spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AppApplication.class, args);




		School sc = context.getBean(School.class);
		sc.getinfo();
		System.out.println("**************************************************************************");
		sc.setIntake(1000);
		sc.setName("NEMS");
		sc.setCity("Yavatmal");
		sc.getinfo();
		System.out.println("**************************************************************************");



		College clg = context.getBean(College.class);
		clg.getinfo();
		System.out.println("**************************************************************************");
		clg.setCity("PUNE");
		clg.setName("VIT");
		clg.setIntake(10000);
		clg.getinfo();
		System.out.println("**************************************************************************");

		// Fetch Student bean and display its data
		Student student = context.getBean(Student.class);
		student.setName("Tanuj");

		if(student.getRollno() == 0)
			System.out.println("Enter Roll Number First");
		else {
			student.getdata();
			return;
		}
		student.setRollno(35);


		System.out.println("**************************************************************************");
		if(student.getRollno() == 0)
			System.out.println("Enter Roll Number First");
		else {
			student.getdata();

				return;
			}
		}





	}

