package org.jsp.library.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages = "org.jsp.library")
@EnableJpaRepositories(basePackages = "org.jsp.library")
public class libConfiguration 
{

	@Bean("entityManagerFactory")
	public LocalEntityManagerFactoryBean getFactory()
	{
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("libraryManagementxml");
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
