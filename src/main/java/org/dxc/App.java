package org.dxc;

import org.dxc.dao.UsersDao;
import org.dxc.dao.UsersDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Users myUsers = new Users(12,"telide","dama@abc.com","manade","telidu");
        UsersDao usersDao = (UsersDao)  context.getBean("daoImp");
        usersDao.insert(myUsers);
    }
}
