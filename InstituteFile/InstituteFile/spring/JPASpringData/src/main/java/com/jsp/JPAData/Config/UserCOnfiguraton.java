package com.jsp.JPAData.Config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.jsp.JPAData")
@EnableJpaRepositories(basePackages = "com.jsp.JPAData")
public class UserCOnfiguraton 
{
	@Bean("entityManagerFactory")
	public LocalEntityManagerFactoryBean getFactory()
	{
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("JPASpringData");
		return bean;
	}
	@Bean("transactionManager")
	public JpaTransactionManager getManager(EntityManagerFactory factory)
	{
		JpaTransactionManager manager=new JpaTransactionManager();
		manager.setEntityManagerFactory(factory);
		return manager;
	}
}
