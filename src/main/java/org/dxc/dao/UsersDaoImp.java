package org.dxc.dao;

import org.dxc.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/*
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
*/

@Repository("daoImp")
public class UsersDaoImp implements UsersDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; // = new JdbcTemplate(getDataSource());

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Users users) {
        String sql = "INSERT INTO users VALUES(?,?,?,?,?)";
        Object[] objects = {users.getId(), users.getUsername(), users.getEmail(), users.getPassword(), users.getEmail()};
        int no_of_rows = jdbcTemplate.update(sql, objects);
        System.out.println("No.of rows inserted is " + no_of_rows);
    }

    @Override
    public void delRecordbyID(int id) {
        String delSQL = "DELETE FROM users where id = ?";
        int noRecordsdel = jdbcTemplate.update(delSQL,id);
        System.out.println("No of records deleted is "+noRecordsdel);
    }

    @Override
    public void delRecordByNamenCity(String name, String city) {
        String sql = "DELETE FROM users WHERE names = ? OR city = ?";
        Object object[]= {name,city};
        int noRecordsDel = jdbcTemplate.update(sql,object);
        System.out.println(noRecordsDel);
    }

/*    public DataSource getDataSource(){
        String url = "jdbc:mysql://127.0.0.1/dxc";
        String username = "root";
        String password = "Rakesh@9";

        DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
        return dataSource;
    }*/
}
