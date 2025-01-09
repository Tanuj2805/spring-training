package com.demo.Spring_JDBC.repositery;

import com.demo.Spring_JDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeRepo {


    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Employee emp)
    {
        String sql = "insert into employee values(?,?,?,?);";
        System.out.println(sql);
        jdbc.update(sql,emp.getName(),emp.getEmp_id(),emp.getSal(),emp.getPosition());


    }


    public List<Employee> viewAllEmployee()
    {
        List<Employee> employees = new ArrayList<Employee>();
        return employees;
    }
}
