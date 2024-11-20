package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dao.PersonDao;
import com.jsp.configuration.personConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(personConfig.class);
        PersonDao persondao=context.getBean(PersonDao.class);
        //persondao.registration();
        persondao.getUserDetailsByUserId(1);
    }
}
