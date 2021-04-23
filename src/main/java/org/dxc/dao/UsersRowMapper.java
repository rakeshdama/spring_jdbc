package org.dxc.dao;

import org.dxc.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("names");
        String emails = rs.getString("emails");
        String passwd = rs.getString("password");
        String city = rs.getString("city");
        Users newUser = new Users(id,name,emails,passwd,city);
        return newUser;
    }
}
