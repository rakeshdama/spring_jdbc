package org.dxc.dao;

import org.dxc.Users;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Users> users = new ArrayList<>();
        while (rs.next()){
            Users users1 = new Users();
            users1.setId(rs.getInt("id"));
            users1.setUsername(rs.getString("names"));
            users1.setEmail(rs.getString("emails"));
            users1.setPassword(rs.getString("password"));
            users1.setCity(rs.getString("city"));
            users.add(users1);
        }
        return users;
    }
}
