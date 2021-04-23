package org.dxc;

import org.dxc.Users;
import org.dxc.dao.UsersDao;
import org.dxc.dao.UsersDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("UsersDaoHelper")
public class UsersDaoHelper {

    @Autowired
    UsersDao usersDaoImp;

    public void insertUsers(){
        Users u1 =new Users(11,"a","a@a","aa","a1");
        Users u2 =new Users(12,"a","a@a","aa","a1");
        Users u3 =new Users(13,"a","a@a","aa","a1");
        ArrayList<Users> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        usersDaoImp.insert(users);


    }
}
