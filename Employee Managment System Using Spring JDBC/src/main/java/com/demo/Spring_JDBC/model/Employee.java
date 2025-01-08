package com.demo.Spring_JDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    String name;
    int emp_id;
    double sal;
    String Position;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
