package org.dxc.dao;

import org.dxc.Users;

public interface UsersDao {
    public void insert(Users users);
    public void delRecordbyID(int id);
    public void delRecordByNamenCity(String name,String city);
    public void truncateData();
}
