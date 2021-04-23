package org.dxc;

import org.dxc.dao.UsersDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // UsersDao usersDao = (UsersDao)  context.getBean("daoImp");
        // usersDao.delRecordbyID(12);
        // insertRecord(context);
        //usersDao.delRecordByNamenCity("Rakesh","Tirupati");
        // usersDao.truncateData();
        UsersDao usersDao = (UsersDao) context.getBean("daoImp");
        List<Users> users = usersDao.getAllUsers();
        printUsers(users);
/*        UsersDaoHelper helper = context.getBean("UsersDaoHelper", UsersDaoHelper.class);
        helper.insertUsers();*/
    }

    private static void printUsers(List<Users> users) {
        for (Users users1:users){
            System.out.println(users1);
        }
    }

    private static void insertRecord(ApplicationContext context) {
        Users myUsers = new Users();
        UsersDao usersDao = (UsersDao) context.getBean("daoImp");
        usersDao.insert(myUsers);
    }
}
