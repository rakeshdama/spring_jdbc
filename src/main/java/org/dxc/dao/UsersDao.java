package org.dxc.dao;

import org.dxc.Users;

import java.util.List;

public interface UsersDao {
    public void insert(Users users);
    public void delRecordbyID(int id);
    public void delRecordByNamenCity(String name,String city);
    public void truncateData();
    public  void insert(List<Users> users);
    public List<Users> getAllUsers();
}
