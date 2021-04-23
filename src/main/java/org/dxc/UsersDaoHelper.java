package org.dxc;

import org.dxc.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("UsersDaoHelper")
public class UsersDaoHelper {

    @Autowired
    UsersDao usersDaoImp;

    public void insertUsers(){
        Users u1 =new Users();
        Users u2 =new Users();
        Users u3 =new Users();
        ArrayList<Users> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        usersDaoImp.insert(users);


    }
}
