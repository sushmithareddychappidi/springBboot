package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.personConfig;
import com.jsp.dao.personDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(personConfig.class);
        personDao persondao = context.getBean(personDao.class);
        persondao.registration();
    }
}
