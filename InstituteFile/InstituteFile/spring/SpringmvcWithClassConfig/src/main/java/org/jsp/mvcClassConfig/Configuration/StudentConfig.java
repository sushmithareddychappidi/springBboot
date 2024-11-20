package org.jsp.mvcClassConfig.Configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class StudentConfig 
{
	@Bean
	public ViewResolver getResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/view/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean bean= new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("SpringmvcWithClassConfig");
		return bean;
	}
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory factory)
	{
		JpaTransactionManager manager=new JpaTransactionManager();
		manager.setEntityManagerFactory(factory);
		return manager;
	}
}
