package com.demo.Spring_JDBC.repositery;

import com.demo.Spring_JDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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


    public void save(Employee emp) {
        String sql = "insert into employee values(?,?,?,?);";
        System.out.println(sql);
        jdbc.update(sql, emp.getName(), emp.getEmp_id(), emp.getSal(), emp.getPosition());


    }


    public List<Employee> viewAllEmployee() {
        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee emp = new Employee();

                emp.setName(rs.getString("name"));
                emp.setEmp_id(rs.getInt("eid"));
                emp.setSal(rs.getInt("sal"));
                emp.setPosition(rs.getString("pos"));


                return emp;
            }
        };

        return jdbc.query("select * from employee", rowMapper);
    }


    public void update(int id,String name,int Sal, String pos)
    {
        String sql = "Update employee set name = ?, sal = ?, pos = ? where eid = ?";
        jdbc.update(sql,name,Sal,pos,id);

    }
}
